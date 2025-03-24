package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest6 {
  @Test(priority=3)
  public void a() {
	  System.out.println("method 1") ; 
   }
  @Test
  public void b() {
	  System.out.println("method 2") ; 
	  
  }
  @Test(priority=2)
  public void d() {
	  System.out.println("method 4") ; 
  }
  
  @Test
  public void c() {
	  System.out.println("method 3") ; 
  }
    @Test(priority=-1)
  public void e() {
	  System.out.println("method 5") ; 
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
