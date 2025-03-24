package com.expleo.Air_irctc;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Title {
public static void main(String [] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.air.irctc.co.in/");
	 
	 WebElement x=driver.findElement(By.xpath("//head//title")); 
//	 String title=driver.getTitle();
	 System.out.println(x);
}
}
