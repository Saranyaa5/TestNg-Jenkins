package com.expleo.Air_irctc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest10 {  // run this file in xml file.dont run the test file
  @Test(alwaysRun=true,groups= {"regressiontest"})
  public void f() {
	  System.out.println("running f");
  }
  @Test(alwaysRun=true,groups= {"regressiontest" ,"smoketest"})
  public void f1() {
	  System.out.println("running f1");
  }
  @Test(alwaysRun=true,groups= {"regressiontest" ,"smoketest","sanitytest"})
  public void f2() {
	  System.out.println("running f2");
  }
  
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
//corresponding xml file

//<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
//<suite name="TestSuite">
//    <test name="Regression and Smoke Tests">
//        <groups>
//            <run>
//                <include name="regressiontest"/>
//                <include name="smoketest"/>
//            </run>
//        </groups>
//        <classes>
//            <class name="com.expleo.Air_irctc.NewTest10"/>
//        </classes>
//    </test>
//</suite>

//
//</test>
//<test name="TQA">
// <groups>
// <run>
//      <include name="demo"></include>
//      <include name="demo1"></include>
// </run>
// </groups>
// <classes>
// <class name="TestNg"/>
// <class name="TestNg2"/>
