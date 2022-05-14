package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutText;

    public String getLogOutText() {

        return getTextFromElement(logoutText);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositeTab;

    public void clickOnDepositeTab() {
        CustomListeners.node.log(Status.PASS,"click on deposite tab" + "'");
        Reporter.log("click on depositeTab " + depositeTab.toString() + "<br>");
        clickOnElement(depositeTab);
    }


    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/div/input")
    WebElement depositeAmount;

    public void enterDepositeAmount(String amount) {

        Reporter.log("Enter amount you want to deposite : " + depositeAmount.toString() + "<br>");
        sendTextToElement(depositeAmount, amount);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositeButton;

    public void clickOnDepositeButton() {
        Reporter.log("click on deposite Button " + depositeButton.toString() + "<br>");
        clickOnElement(depositeButton);
    }


    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositeSucessfullMessage;

    public String getDepositeSucessfullMessage() {
        Reporter.log("get deposite sucessfully message" + depositeSucessfullMessage.toString() + "<br>");
        return getTextFromElement(depositeSucessfullMessage);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawlTab;

    public void clickOnWithDrawalTab() {
        Reporter.log("click on withdrawl tab" + withdrawlTab.toString() + "<br>");
        clickOnElement(withdrawlTab);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement withdrawAmount;

    public void enterWithdrawAmount(String amt)
    {
        Reporter.log("Enter withdraw amount: " + withdrawAmount.toString() + "<br>");
        sendTextToElement(withdrawAmount,amt);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawButton;

    public void clickOnWithdrawButton()
    {
        Reporter.log("clicck on withdraw button:  " + withdrawAmount.toString() + "<br>");
        clickOnElement(withdrawButton);
    }


    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionSucessfullMessage;

    public  String  getTransactionSucessfulMessage()
    {
        return getTextFromElement(transactionSucessfullMessage);
    }

}