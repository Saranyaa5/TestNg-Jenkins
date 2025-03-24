package com.expleo.Air_irctc;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest9 {
	public ChromeDriver driver;
	public WebDriverWait wait;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get("https://www.google.co.in");
  }

  @AfterTest
  public void afterTest() {
  }

}
