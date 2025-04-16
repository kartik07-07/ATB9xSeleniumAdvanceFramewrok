package com.kartik.Driver;

import com.kartik.Utils.PropertiesReader;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.sql.Driver;
import java.util.Locale;
import java.util.spi.AbstractResourceBundleProvider;

public class DriverManager  {

    // is to give you the instance of driver
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {

        DriverManager.driver = driver;
    }



    //we want to start the  Browser

    public static  void init(){

        String browser = PropertiesReader.readKey("browser");
        browser = browser.toLowerCase();
        if (driver == null){
            switch (browser){
                case "edge":
                    EdgeOptions edgeoptions = new EdgeOptions();
                    edgeoptions.addArguments("guest");
                    edgeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    edgeoptions.addArguments("--start-maximized");
                     driver = new EdgeDriver(edgeoptions);
                     break;
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("guest");
                    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    chromeOptions.addArguments("--start-maximized");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                default:
                    System.out.println("Not browser Found !");

            }
        }


    }

// we want to close the browser
    public static  void down(){
  if (driver != null){
      driver.quit();
      driver = null;
  }
    }


}
