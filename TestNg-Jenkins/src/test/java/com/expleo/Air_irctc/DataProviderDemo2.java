package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import java.time.Duration;

public class DataProviderDemo2 {
    WebDriver driver;

    @Test(dataProvider = "testData", dataProviderClass = DataProviderClass1.class)
    public void search(String keyWord) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement txtBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sb_form_q")));
        txtBox.sendKeys(keyWord);
        System.out.println("Keyword entered: " + keyWord);
        txtBox.sendKeys(Keys.ENTER);
        System.out.println("Search result displayed");

        
       // wait.until(ExpectedConditions.titleContains(keyWord));
        String searchPageTitle = driver.getTitle();  
        System.out.println("Page title: " + searchPageTitle);
      //Assert.assertTrue(searchPageTitle.contains(keyWord), "Search is not successful");
        String expectedTitle = keyWord+"- Sesrch";
      Assert.assertEquals(searchPageTitle,expectedTitle,"Search is not successful");
    }


    @BeforeMethod
    public void beforeMethod() {
    	System.out.println("start the test");
  	  driver=new ChromeDriver();
  	  
  	  driver.get("https://bing.com/");
  	  driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        System.out.println("End of the test");
    }
}
