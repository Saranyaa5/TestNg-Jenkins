package com.expleo.Air_irctc;

import org.testng.annotations.DataProvider;

public class DataProviderClass1 {

    @DataProvider(name = "testData")
    public Object[][] dataProvFunc() {
        return new Object[][] { { "selenium" }, { "TestNG" } ,{"java"}};
    }
}
