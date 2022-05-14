package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    public AddCustomerPage() {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    WebElement firstName;

    public void enterFirstName(String fname)
    {
        Reporter.log("Enter First Name: " + fname + firstName.toString() + "<br>");
        sendTextToElement(firstName,fname);
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    WebElement lastName;

    public void enterLastName(String lname)
    {
        Reporter.log("Enter Last Name: " + lname + lastName.toString() + "<br>");
        sendTextToElement(lastName,lname);
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    WebElement postCode;

    public void enterPostCode(String pcode)
    {
        Reporter.log("Enter Post code : " + pcode + postCode.toString() + "<br>");
        sendTextToElement(postCode,pcode);
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")
    WebElement addCustomerButton;

    public void clickOnAddCustomerButton()
    {
        Reporter.log("Click on Add customer button " + addCustomerButton.toString() + "<br>");
        clickOnElement(addCustomerButton);
    }

   public String verifyPopMessageFromAlert()
   {
       Reporter.log("verify the pop message : "+"Customer added sucessfully" + "<br>");
      return getTextFromAlert();
   }

   public void clickOnOKinPopUp()
   {
       Reporter.log("click on Ok in the popup " + "<br>");
       acceptAlert();
   }
}
