package com.kartik.Pages.pageObjectModel.vwo.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashBoardPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver){

        this.driver=driver;
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    public String LoggedInUserName(){
  try{
      Thread.sleep(10000);
  } catch (InterruptedException e) {
      throw new RuntimeException(e);
  }

        return driver.findElement(userNameOnDashboard).getText();
    }

}
