package com.expleo.poModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrm2 {
    public WebDriver driver;

    @FindBy(name="username")
    private WebElement usernameField;

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath="//button[text()='Login']")
    private WebElement loginButton;

    public OrangeHrm2() {
        
    }

    @BeforeTest
    public void beforeTest() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        PageFactory.initElements(driver, this);
    }

    @Test
    public void loginPage() {
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Not in login page");

        userLogin();
    }

    public void userLogin() {
    	
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        loginButton.click();
    }

    @AfterTest
    public void afterTest() {
       driver.quit();
    }
}
