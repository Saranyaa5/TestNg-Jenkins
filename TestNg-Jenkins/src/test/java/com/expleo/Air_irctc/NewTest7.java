package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class NewTest7 {
  @Test(enabled=false)
  public void a() {
	  System.out.println("method 1");
  }
  @Ignore
  @Test
  public void b() {
	  System.out.println("method 200");

  }
  @Test
  public void c() {
	  System.out.println("method 3");

  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}



//@Ignore // This will ignore the entire class
//public class IgnoreClassExample {
//
//    @Test
//    public void testMethod1() {
//        System.out.println("This will NOT execute.");
//    }
//
//    @Test
//    public void testMethod2() {
//        System.out.println("This will NOT execute.");
//    }
//}

