
    package org.example.stepdefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

    public class hooks {

        public static WebDriver driver;


        @Before
       public static void openbrwser(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
        @After
        public static void quetbrowser() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }
        }




