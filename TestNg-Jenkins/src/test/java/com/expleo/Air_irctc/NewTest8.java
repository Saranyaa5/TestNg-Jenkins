package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class NewTest8 {
	
  
  @Test
  public void f() {
      System.out.println("Executing method f");
  }

  @Test
  public void e() {
      System.out.println("Executing method e");
  }

  @Test(dependsOnMethods = "f")
  public void f1() {
      System.out.println("Executing method f1 (depends on f)");
  }

  @Test(dependsOnMethods = "e")
  public void f2() {
      System.out.println("Executing method f2 (depends on e)");
  }

  @Test(dependsOnMethods = {"f", "f1"})
  public void f3() {
      System.out.println("Executing method f3 (depends on f and f1)");
  }

  @BeforeTest
  public void beforeTest() {
      System.out.println("Before Test Setup");
  }

  @AfterTest
  public void afterTest() {
      System.out.println("After Test Cleanup");
  }
}
