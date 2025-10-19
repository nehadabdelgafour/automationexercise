package org.example.stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P001_Register;
import org.testng.asserts.SoftAssert;

public class D001_Register {
    P001_Register register=new P001_Register();
    SoftAssert soft =new SoftAssert();
    Faker faker =new Faker();
    //@Given("navigate to correct url")
   // public void navigatetocorrect(){
       // hooks.driver.get("https://automationexercise.com/");
   // }

    @Given("user open home url")
    public void userOpenHomeUrl() {
        hooks.driver.get("https://automationexercise.com");
    }

    @When("user click on signup")
    public void userClickOnSignup() {
        register.loginbtn.click();
    }

    @And("Signup Text is visible")
    public void signupTextIsVisible() {
        soft.assertEquals(register.signuptext.getText(), "New User Signup!");
    soft.assertAll();
    }

    @And("Fill with valid data")
    public void fillWithValidData() {
        register.neme.sendKeys(faker.name().firstName());
        register.EmailAddress.sendKeys(faker.internet().emailAddress());
    }
}
