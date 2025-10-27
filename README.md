# 🧪 Automation Testing Project – Registration Flow #
Using Java, Selenium WebDriver, TestNG & Cucumber (BDD)


# 📖 Project Overview

This project automates the user registration process on the demo website Automation Exercise
.
It follows the Behavior Driven Development (BDD) approach using Cucumber, and is built with a Page Object Model (POM) structure for clean, reusable, and maintainable code.

# ⚙️ Tech Stack


Programming Language: Java

Testing Framework: TestNG

Automation Tool: Selenium WebDriver

BDD Framework: Cucumber

Design Pattern: Page Object Model (POM)

Data Generator: Java Faker

Build Tool: Maven

Browser: Google Chrome (via WebDriverManager)

# 🧩 Project Structure

src/test/java
│
├── org.example.pages        → Page Object classes  
├── org.example.stepdefs     → Step Definitions & Hooks  
├── org.example.runners      → Test Runner class  
└── org/example/hooks        → Setup & Teardown (Before/After)




# 📄 Feature File Example

Feature: Register
  Scenario: Verify that user can register with valid data
    Given user open home url
    When user click on signup
    And Signup Text is visible
    And Fill with valid data
    And user click on signup button
    And Enter Account Information
    And Address Information
    And user click on continue button

# 🚀 How to Run the Tests

Clone the repository

git clone https://github.com/nehadabdelgafour/automationexercise.git

Open the project in IntelliJ IDEA.

Run the TestRunner.java file.

View the results in the console or generated HTML report (target/cucumber-report.html).



# 📊 Test Reporting

The project uses Cucumber’s built-in HTML report:
target/cucumber-report.html

You can enhance it later using Extent Reports or Allure.


# 💡 Future Enhancements

Add more scenarios (Login, Logout, Negative Tests).

Integrate Allure or Extent Reports for better visualization.

Configure the framework with CI/CD (Jenkins or GitHub Actions).

Add API testing layer with RestAssured.


# 👩‍💻 Author

Nehad .
Junior Automation Tester
🔗 LinkedIn (https://www.linkedin.com/in/nehad-el-karamany-5a86271b8?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app)

📧 [elkaramanynehad@gmail.com]
