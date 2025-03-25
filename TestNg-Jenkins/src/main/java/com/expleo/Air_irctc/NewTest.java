//package com.expleo.Air_irctc;
//
//import org.testng.annotations.Test;
//
//import org.testng.annotations.BeforeTest;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//
//public class NewTest {
//    public ChromeDriver driver;
//    public WebDriverWait wait;
//
//    @Test
//    public void AssertionExample() {
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        String str3 = null;
//        String str4 = "hello";
//        String str5 = "hello";
//        String str6 = new String("not hello");
//        int val1 = 5;
//        int val2 = 6;
//
//        Assert.assertEquals(str1, str2, "Assert Equals failed: str1 and str2 are not equal");
//        System.out.println("Equal assertion is successful");
//
//        Assert.assertNotEquals(str1, str6, "Assert Not Equals failed: str1 and str6 are equal");
//        System.out.println("Not equal assertion is successful");
//
//        Assert.assertTrue(val1 < val2, "Assert True failed: val1 is NOT less than val2");
//        System.out.println("Assert True is successful");
//
//        Assert.assertFalse(val1 > val2, "Assert False failed: val1 is greater than val2");
//        System.out.println("Assert False is successful");
//
//        Assert.assertNotNull(str1, "Assert Not Null failed: str1 is null");
//        System.out.println("Assert Not Null is successful");
//
//        Assert.assertNull(str3, "Assert Null failed: str3 is NOT null");
//        System.out.println("Assert Null is successful");
//
//        Assert.assertSame(str4, str5, "Assert Same failed: str4 and str5 do not refer to the same object");
//        System.out.println("Assert Same is successful");
//
//        Assert.assertNotSame(str1, str3, "Assert Not Same failed: str1 and str3 refer to the same object");
//        System.out.println("Assert Not Same is successful");
//    }
//
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("Before Test - Setup can go here");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("After Test - Cleanup can go here");
//        
//    }
//}
