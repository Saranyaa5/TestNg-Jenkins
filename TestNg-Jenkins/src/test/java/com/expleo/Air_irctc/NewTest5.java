package com.expleo.Air_irctc;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest5 {
	 public ChromeDriver driver;
	    public WebDriverWait wait;
  @Test
  public void AssertionExample() {
	
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.linkText("Register")).click();
	  String registertitle="Register Account";
	  String actualregistertitle=driver.getTitle();
	  
	  //Assert.assertEquals(registertitle,actualregistertitle,"register page title not same");
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(registertitle,actualregistertitle,"register page title not same");
	  
	  driver.findElement(By.linkText("Qafox.com")).click();
		 
	  String title="Your Store";
	  String actualtitle=driver.getTitle();
	  //Assert.assertEquals(title,actualtitle,"store page title not same");
	  soft.assertEquals(title,actualtitle,"store page title not same");
	 //soft.assertAll();
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get("https://tutorialsninja.com/demo/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
