package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility {

    public CustomersPage() {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDown;

    public void selectYourNameFromDropDown(String name)
    {
        Reporter.log("select name from the dropdown" + "<br>");
        selectByVisibleTextFromDropDown(yourNameDropDown,name);
    }

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    public void clickOnLoginButton()
    {
        Reporter.log("click on login button: " + "<br>");
        clickOnElement(loginButton);
    }


    @FindBy(xpath = "//label[contains(text(),'Your Name : ')]")
    WebElement yourNameText;

    public String getYourNameText()
    {
        Reporter.log("verify the text Your Name " + "<br>");
      return getTextFromElement(yourNameText).substring(0,9);
    }

}
