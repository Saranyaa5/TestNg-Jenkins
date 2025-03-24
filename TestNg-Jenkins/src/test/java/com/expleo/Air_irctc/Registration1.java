package com.expleo.Air_irctc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration1 {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.air.irctc.co.in/");

        WebElement registration1 = driver.findElement(By.xpath("//div[@class=\"col-6 col-md-8 col-lg-6 px-1\"]//div//ul//li//a"));

        // Using CSS Selector (ID)
        WebElement registration2 = driver.findElement(By.cssSelector("#dropdownRegistration"));
        
        WebElement registration3 = driver.findElement(By.linkText("User Registration"));

        // Printing Elements (Debugging)
        System.out.println("registration1: " + registration1.getText());
        System.out.println("registration2: " + registration2.getText());
        System.out.println("registration3: " + registration3.getText());

       

        registration1.click(); 
         
        // Close Browser
        driver.quit();
    }
}
