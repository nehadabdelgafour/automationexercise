package org.example.stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P001_Register;
import org.openqa.selenium.support.ui.Select;
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

    @And("user click on signup button")
    public void userClickOnSignupButton() {
        register.Signup.click();
    }

    @And("Enter Account Information")
    public void enterAccountInformation() {
        register.gender.click();
        register.password.sendKeys("PASS12345786");
       // register.password.sendKeys(faker.internet().password());
        Select days =new Select(register.days);
        days.selectByValue("8");
        Select months =new Select(register.months);
        months.selectByValue("8");
        Select years =new Select(register.years);
        years.selectByValue("2020");
        register.checkbox.click();
    }

    @And("Address Information")
    public void addressInformation() {
    register.firstname.sendKeys(faker.name().firstName());
    register.lastname.sendKeys(faker.name().lastName());
    register.company.sendKeys(faker.company().name());
    register.address1.sendKeys(faker.address().fullAddress());
    register.address2.sendKeys(faker.address().secondaryAddress());
    Select country =new Select(register.country);
    country.selectByValue("Canada");
    register.state.sendKeys(faker.address().state());
    register.city.sendKeys(faker.address().city());
    register.zipcode.sendKeys(faker.address().zipCode());
    register.mobilenumber.sendKeys(faker.phoneNumber().cellPhone());
    register.createaccount.click();
    }
}
