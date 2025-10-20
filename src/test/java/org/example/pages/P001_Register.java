package org.example.pages;

import org.example.stepdefs.hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class P001_Register {
    public P001_Register(){
        PageFactory.initElements(hooks.driver , this );
    }
    @FindBy(css = "a[href=\"/login\"]")
    public WebElement loginbtn;
    @FindBy(css = "div[class=\"signup-form\"] h2")
    public WebElement signuptext;
    @FindBy(css = "input[placeholder=\"Name\"]")
    public WebElement neme;
    @FindBy(css = "form[action=\"/signup\"] input[placeholder=\"Email Address\"]")
    public WebElement EmailAddress;
    @FindBy(css = "button[data-qa=\"signup-button\"]")
    public WebElement Signup;
    @FindBy(id = "id_gender1")
    public WebElement gender;
    //@FindBy(id =" name")
    //public WebElement NEME;
    //@FindBy(id = "email")
    //public WebElement EMAIL;
    @FindBy(css = "input[type=\"password\"]")
    public WebElement password;
    @FindBy(id = "days")
    public WebElement days;
    @FindBy(id = "months")
    public WebElement months;
    @FindBy(id = "years")
    public WebElement years;
    @FindBy(id = "newsletter")
    public WebElement checkbox;
    @FindBy(id = "first_name")
    public WebElement firstname;
    @FindBy(id = "last_name")
    public WebElement lastname;
    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id = "address1")
    public WebElement address1;
    @FindBy(id = "address2")
    public WebElement address2;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "state")
    public WebElement state;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "zipcode")
    public WebElement zipcode;
    @FindBy(id = "mobile_number")
    public WebElement mobilenumber;
    @FindBy(css = "button[data-qa=\"create-account\"]")
    public WebElement createaccount;



}
