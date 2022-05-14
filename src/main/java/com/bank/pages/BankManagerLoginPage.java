package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility
{
    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/button[1]")
    WebElement addCustomerTab;

    public void clickOnAddCustomerTab()
    {
        Reporter.log("click on Add customer tab"+addCustomerTab.toString() + "<br>");
        clickOnElement(addCustomerTab);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountTab;

    public void clickONOpenAccountTab()
    {
        Reporter.log("click on open account tab" + openAccountTab.toString() + "<br>");
        clickOnElement(openAccountTab);
    }
}
