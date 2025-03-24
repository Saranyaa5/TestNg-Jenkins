package com.expleo.Air_irctc;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
  @Test
  public void login() {
	  System.out.println("login successfull");
  }
  @Test
  public void logout() {
	  System.out.println("log out successfull");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("----------- before method----------");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("----------- after method----------");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("###### before class ########");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("###### after class ########");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("*********** before test ***********");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("*********** before test ***********");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("!!!!! before suite !!!!!");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("!!!!! after suite !!!!!");
  }

}
