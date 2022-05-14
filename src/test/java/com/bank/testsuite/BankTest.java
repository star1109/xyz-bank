package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomersPage customersPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customersPage = new CustomersPage();
        addCustomerPage = new AddCustomerPage();
        accountPage = new AccountPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("star11");
        addCustomerPage.enterLastName("Moon");
        addCustomerPage.enterPostCode("124578");
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(2000);
        String actual = addCustomerPage.verifyPopMessageFromAlert();
        Assert.assertTrue(actual.contains("Customer added successfully"));
        addCustomerPage.clickOnOKinPopUp();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnHomeButton();
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickONOpenAccountTab();
        openAccountPage.selectCustomerFromDropDown("star11 Moon");
        openAccountPage.selectCurrencyFromDropDown("Dollar");
        openAccountPage.clickOnProcessButton();
        String expectedMessage = "Account created successfully";
        String actualMessage = openAccountPage.verifyTheMessageAccountCreatedSucessfully();
        Assert.assertEquals(actualMessage, expectedMessage);
        openAccountPage.clickOnOKInPopUp();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLoginTab();
        customersPage.selectYourNameFromDropDown("star11 Moon");
        customersPage.clickOnLoginButton();

    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLoginTab();
        customersPage.selectYourNameFromDropDown("star11 Moon");
        customersPage.clickOnLoginButton();
        accountPage.clickOnDepositeTab();
        accountPage.enterDepositeAmount("100");
        accountPage.clickOnDepositeButton();
        String expected = "Deposit Successful";
        String actual = accountPage.getDepositeSucessfullMessage();
        Assert.assertEquals(actual, expected, "error occured");
    }

    @Test(groups = "regression")
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLoginTab();
        customersPage.selectYourNameFromDropDown("star11 Moon");
        customersPage.clickOnLoginButton();
        accountPage.clickOnWithDrawalTab();
        accountPage.enterWithdrawAmount("50");
        accountPage.clickOnWithdrawButton();
        Thread.sleep(2000);
        String expected = "Transaction successful";
        String actual = accountPage.getTransactionSucessfulMessage();
        Assert.assertEquals(actual, expected, "error");


    }
}
