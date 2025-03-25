package com.expleo.poModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class PomBasics1 {
    WebDriver driver;
    GooglePage googlePage;

    // ======== PAGE OBJECT CLASS ==========
    public static class GooglePage {
        WebDriver driver;

        @FindBy(name = "q")
        private WebElement searchBox;

        public GooglePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void searchFor(String query) {
            searchBox.sendKeys(query);
            searchBox.submit();
        }
    }

    // ======== TEST CLASS ==========
    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Uncomment for headless execution
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");

        googlePage = new GooglePage(driver); // Initialize Page Object
    }

    @Test(priority = 1)
    public void verifyHomepageTitle() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Not on the Google homepage");
    }

    @Test(priority = 2)
    public void searchTest() {
        googlePage.searchFor("Expleo");
        Assert.assertTrue(driver.getTitle().contains("Expleo"), "Search result title does not match.");
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("Test Execution Completed Successfully!");
    }
}
