package com.expleo.poModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PomBasics1 {
    public WebDriver driver;

    @FindBy(xpath="//input[@name='q']") 
    private WebElement searchBox;
  
    public void searchFor(String text) {
        searchBox.sendKeys(text);
        searchBox.submit();
    }
    
    @Test
    public void homepage() {
        String expected_title = "Google";
        String title = driver.getTitle();
        Assert.assertEquals(title, expected_title, "Not on the Google homepage");
    }

    @BeforeTest
    public void BeforeTest() { 
        
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        driver = new ChromeDriver(option); 
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
       
        PageFactory.initElements(driver, this);
    }

    @AfterTest
    public void AfterTest() {
    	System.out.println("successfull");
        if (driver != null) {
            driver.quit();
        }
    }
}
