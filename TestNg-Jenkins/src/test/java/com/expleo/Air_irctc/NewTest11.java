package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class NewTest11 {

  @Test
  @Parameters({"val1","val2"})
  public void f(int n1,int n2) {
	  
	  int sum=n1+n2;
	  System.out.println("the final sum is : "+sum);
  }
  
  @Test
  @Parameters({"val3","val4"})
  public void f1(int n3,int n4) {
	  
	  int sum=n3-n4;
	  System.out.println("the final sum is : "+sum);
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



//
//<test name="params">
//<parameter name="val1" value="2"/>
//<parameter name="val1" value="1"/>
//<parameter name="val1" value="4"/>
//<parameter name="val1" value="2"/>
//
//</test>