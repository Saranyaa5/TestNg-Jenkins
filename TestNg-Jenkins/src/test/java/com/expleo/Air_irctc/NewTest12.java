package com.expleo.Air_irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

// Attach the Listener to the Test Class
@Listeners(ListenerTest.class)
public class NewTest12 {

    public WebDriver driver;
    public WebDriverWait wait;

    @Test
    public void Userlogin() {
//        driver.findElement(By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div[2]//input")).sendKeys("Admin");
//        driver.findElement(By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div[2]//input[@name=\"password\"]")).sendKeys("admin123");
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        username.sendKeys("Admin");
    	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();

    	// Wait for the logout button to be present
    	WebElement logoutButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")));

    	// Click the logout button
    	logoutButton.click();

    	// Wait for the logout link to appear
    	WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
    	//WebElement logoutLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));

    	// Get the actual text of the logout link
    	String actual = logoutLink.getText();

    	// Expected text
    	String expected = "Logout";
        Assert.assertEquals(actual, expected, "Login not successful!");
    }

    @Parameters("browser")
    @BeforeTest
    public void beforeTest(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser name: " + browser);
        }

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @AfterTest
    public void afterTest() {
        if (driver != null) {
            driver.quit(); 
        }
    }
}

//
//<test name="ChromeTest">
//<parameter name="browser" value="chrome"/>
//<classes>
//    <class name="com.expleo.Air_irctc.NewTest12"/>
//</classes>
//</test>
//
//<test name="EdgeTest">
//<parameter name="browser" value="edge"/>
//<classes>
//    <class name="com.expleo.Air_irctc.NewTest12"/>
//</classes>
//</test>