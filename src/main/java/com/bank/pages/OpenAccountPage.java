package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDown;

    public void selectCustomerFromDropDown(String name)
    {
        Reporter.log("select name from dropdown: " +customerDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(customerDropDown,name);
    }

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDown;
    public void selectCurrencyFromDropDown(String currency)
    {
        Reporter.log("select currency from dropdown" +currencyDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(currencyDropDown,currency);
    }

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public void clickOnProcessButton()
    {
        Reporter.log("click on process button " +processButton.toString() + "<br>");
        clickOnElement(processButton);
    }

    public String verifyTheMessageAccountCreatedSucessfully()
    {
        Reporter.log("verify the text Account created sucessfully" + "<br>");
        return getTextFromAlert().substring(0,28);
    }

    public void clickOnOKInPopUp()
    {
        Reporter.log("Accept the Alert " + "<br>");
        acceptAlert();
    }




}
