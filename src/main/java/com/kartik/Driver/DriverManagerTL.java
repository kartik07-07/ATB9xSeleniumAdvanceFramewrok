package com.kartik.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import com.kartik.Driver.DriverManagerTL;


public class DriverManagerTL {
    // if we want to secure our thread we have to keep in this <....>.
    public static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();


    public static void setDriver(WebDriver driverRef) {
//Setting a driver
    }

    public static WebDriver getDriver() {
           return dr.get();
           //get a driver
        }


 //this will remove the thread local

public static  void unload(){
        dr.remove();
        //unloading the webdriver
}

    public  static void init()throws MalformedURLException{
        if(Objects.isNull(DriverManagerTL.getDriver())){
            WebDriver driver = new EdgeDriver();
            setDriver(driver);
        }
    }


//this will stop your session
public static void down(){
        if(Objects.nonNull(DriverManagerTL.getDriver())){
          getDriver().quit();
          unload();

            }
        }





}












