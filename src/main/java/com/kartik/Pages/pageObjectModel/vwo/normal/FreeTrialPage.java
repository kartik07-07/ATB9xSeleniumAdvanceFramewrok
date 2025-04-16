package com.kartik.Pages.pageObjectModel.vwo.normal;

import com.kartik.Base.CommonToallPage;
import com.kartik.Driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FreeTrialPage extends CommonToallPage {
    WebDriver driver;

    public  FreeTrialPage(WebDriver driver){
        this.driver = driver;
    }


    By freetrial = By.linkText("Start a free trial");


   public void StartFreeTrial(){
     driver.get("https://app.vwo.com/#/login");

       driver.findElement(freetrial).click();

   }


}
