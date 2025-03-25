package com.expleo.Air_irctc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PomBasics1 {
    public WebDriver driver;

    @FindBy(xpath="///*[@name='q']") 
    private WebElement searchBox;
  
    public void searchFor() {
        searchBox.sendKeys();
        searchBox.submit();
    }
   

    @BeforeTest
    public void BeforeTest() { 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
