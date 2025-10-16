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
}
