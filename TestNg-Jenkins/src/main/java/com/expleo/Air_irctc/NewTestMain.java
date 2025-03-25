//package com.expleo.Air_irctc;
//
//import java.time.Duration;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class NewTestMain {
//    public WebDriver driver;
//    public WebDriverWait wait;
//
//    @BeforeTest
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.get("https://thinking-tester-contact-list.herokuapp.com");
//    }
//
//    @Test
//    public void validateDynamicTable() {
//        // Login
//        driver.findElement(By.id("email")).sendKeys("2k21cse128@kiot.ac.in");
//        driver.findElement(By.id("password")).sendKeys("1234567");
//        driver.findElement(By.id("submit")).click();
//
//        // Wait for the table to be visible
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']")));
//
//        // Get first column elements
//        List<WebElement> firstColumnElements = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));
//
//        // Print first column data
//        for (WebElement element : firstColumnElements) {
//            System.out.println(element.getText());
//        }
//
//        // Find row where name is "tharani k" and print full row data
//        int rowIndex = 1;
//        for (WebElement element : firstColumnElements) {
//            if (element.getText().equalsIgnoreCase("tharani k")) {
//                List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id='myTable']//tr[" + rowIndex + "]//td"));
//                
//                System.out.println("Full row data for 'tharani k':");
//                for (WebElement val : rowElements) {
//                    System.out.print(val.getText() + " ");
//                }
//                System.out.println();
//                break;
//            }
//            rowIndex++;
//        }
//    }
//    
//
//    @AfterTest
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
