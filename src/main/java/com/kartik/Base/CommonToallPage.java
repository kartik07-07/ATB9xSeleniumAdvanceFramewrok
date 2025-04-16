package com.kartik.Base;

import com.kartik.Driver.DriverManagerTL;
import com.kartik.Utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.nio.file.Watchable;
import java.time.Duration;
import static com.kartik.Driver.DriverManagerTL.getDriver;



public class CommonToallPage {

    // If you want to call something before every Page Object Class call, Put your Code here");
    // Open File, Open Data Base Connection You can write code here


    public CommonToallPage(){
// If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here

    }
public void openVWOUrl(){
        getDriver().get(PropertiesReader.readKey("url"));
}
public void custome_wait(){

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
}


public void clickElement(By by){

        DriverManagerTL.getDriver().findElement(by).click();

    }


public void clickElement(WebElement by) {

        by.click();
}

public void enterInput(By by, String key){

        getDriver().findElement(by).sendKeys(key);
}

    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }

public String getText(By by){
    return getDriver().findElement(by).getText();
}




public WebElement presenceofElement(By elementLocation){
    return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
}


public WebElement visibilityOfElement(By elementLocation) {
    return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
}


public WebElement getElement(By key) {
    return getDriver().findElement(key);
}
}