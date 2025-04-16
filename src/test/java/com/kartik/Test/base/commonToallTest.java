package com.kartik.Test.base;

import com.kartik.Driver.DriverManager;
import com.kartik.Driver.DriverManagerTL;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class commonToallTest {

    @BeforeTest
    protected void setUp() throws MalformedURLException{
        DriverManagerTL.init();
    }


    @AfterTest
    protected  void get() throws MalformedURLException{
        DriverManagerTL.down();
    }
}
