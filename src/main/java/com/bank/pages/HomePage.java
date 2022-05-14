package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility
{
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginButton;

    public void clickOnBankManagerLogin()
    {
        Reporter.log("click on bank manager login tab" +bankManagerLoginButton.toString() + "<br>");
        clickOnElement(bankManagerLoginButton);
    }

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginTab;

    public void clickOnCustomerLoginTab()
    {
        Reporter.log("click on Coustomer login tab" +customerLoginTab.toString() + "<br>");
        clickOnElement(customerLoginTab);
    }


    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButton;

    public void clickOnHomeButton()
    {
        clickOnElement(homeButton);
    }

}
