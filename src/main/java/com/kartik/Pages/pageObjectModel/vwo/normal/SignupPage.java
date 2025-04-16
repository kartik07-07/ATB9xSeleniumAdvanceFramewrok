package com.kartik.Pages.pageObjectModel.vwo.normal;

import com.kartik.Base.CommonToallPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class SignupPage extends CommonToallPage {

    WebDriver driver;



    public SignupPage(WebDriver driver){
       this.driver = driver;
    }

    By emailInput = By.cssSelector("input[type='email']");
    By checkbox = By.cssSelector("input[type='checkbox']");
    By createAccountButton = By.xpath("//button[contains(text(), 'Create a Free Trial Account')]");

    // Actions
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickCheckbox() {
        driver.findElement(checkbox).click();
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }



}
