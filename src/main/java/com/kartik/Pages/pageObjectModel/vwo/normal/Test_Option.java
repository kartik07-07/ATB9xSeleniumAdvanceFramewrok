package com.kartik.Pages.pageObjectModel.vwo.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Option{

    WebDriver driver;


    public  Test_Option(WebDriver driver){

        this.driver = driver ;
    }

   private  By Testmenu = By.xpath("//button[@vwo-simple-collapsible='testing']");

   // List<WebElement> list_heatmaps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));
    private By abTestOption= By.xpath("//a[@class='navbar-sub-group-btn selected']");


public void clickOntestingMenu() {
        driver.get("https://app.vwo.com/#/login");
    driver.findElement(Testmenu).click();
}

    public void clickOnABtestingMenu() {

        driver.findElement(abTestOption).click();
    }

//After click on Test it should go and click on A/B.

//a[@class='navbar-sub-group-btn selected']

//    public void A_B(WebDriver driver){
//
//
//    By.xpath("a[@class='navbar-sub-group-btn selected']");
//
//    }
    public void gotoABTestSection(){
    clickOnABtestingMenu();
    clickOnABtestingMenu();
    }

}
