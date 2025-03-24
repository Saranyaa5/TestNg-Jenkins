package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import java.time.Duration;

public class NewTest5 {
    public WebDriver driver;
    public WebDriverWait wait;

    @Test
    public void AssertionExample() {
        SoftAssert soft = new SoftAssert();

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();
        
        String expectedRegisterTitle = "Register Account";
        String actualRegisterTitle = driver.getTitle();
        soft.assertEquals(actualRegisterTitle, expectedRegisterTitle, "Register page title does not match");

        driver.findElement(By.linkText("Qafox.com")).click();
        
        String expectedTitle = "Your Store";
        String actualTitle = driver.getTitle();
        soft.assertEquals(actualTitle, expectedTitle, "Store page title does not match");

        // Ensure all soft assertions are verified
        soft.assertAll();
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");  // Ensure correct path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Added implicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
    }

    @AfterTest
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
