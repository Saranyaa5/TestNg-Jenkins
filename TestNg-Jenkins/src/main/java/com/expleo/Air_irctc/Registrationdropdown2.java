package com.expleo.Air_irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Registrationdropdown2 {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.air.irctc.co.in/");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 1: Click on the dropdown to make it visible
//        WebElement dropdownButton = driver.findElement(By.id("dropdownRegistration"));
//        dropdownButton.click();

        // Step 2: Wait for the dropdown menu to appear
//        WebElement firstLink = driver.findElement(By.cssSelector(".dropdown-menu.show a:first-of-type"));
//	    firstLink.click();
//	    WebElement SecondLink = driver.findElement(By.cssSelector(".dropdown-menu.show a:nth-child(2)"));
//	    SecondLink.click();
//	    WebElement thirdLink = driver.findElement(By.cssSelector(".dropdown-menu.show a:nth-child(3)"));
//	    thirdLink.click();
	    
//	    WebElement hotelLink = driver.findElement(By.xpath("//span[text()='Hotels']/ancestor::a"));
//	    System.out.println(hotelLink.getText());
//	    hotelLink.click();
	    
	    //IRCTC Hotels
//	    WebElement newtabtitle=driver.findElement(By.xpath("/html/head/title"));
//	    System.out.println(newtabtitle.);
//	    
        WebElement googlePlayLink = driver.findElement(By.linkText("Google Play"));

        googlePlayLink.click();
//System.out.println(hotelLink.getText());
	    
        
        
       
    }
}
