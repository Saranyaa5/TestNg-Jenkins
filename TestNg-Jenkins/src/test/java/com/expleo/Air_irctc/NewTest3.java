package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest3 {
    public ChromeDriver driver;
    public WebDriverWait wait;

    @Test
    public void validatetitle() {
        String expected = "Googe";
        String actual = driver.getTitle();
//        Assert.assertEquals(actual, expected, "Title does not match!");
        Assert.assertFalse(expected.equals(actual), "Title is not matching!");

    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.google.co.in");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
