//package com.kartik.Pages.pageObjectModel.vwo;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class Loginpage {
//
//    //page classs
//    // page Loactor
//
//
//    WebDriver driver;
//
//    //parameterise constructor
//    public Loginpage(WebDriver driver){
//        this.driver = driver;
//    }
//
//    // tep 1 - Page-Locators
//    //Encapsulation because  that's why private is use
//    private By username = By.id("input[@id='login-username']");    //input[@id='login-username']
//    private By password = By.id("i//input[@id='login-password']']");
//    private By signButton = By.id("//span[@data-qa='ezazsuguuy']");
//    private By error_message = By.id("//div[@id='js-notification-box-msg']");
//
//
//    //If you are not using it no need to keep
//   // private By signinusingsso = By.xpath("///button[normalize-space()='Sign in using SSO']");
//
//   // Step - 2 page Actions
//    // you want to find those element and click on it
//
//    public String loginToVEWOLoginINValidId(String user,String pwd){
//    driver.get("https://app.vwo.com/#/login");
//    driver.findElement(username).sendKeys(user);
//    driver.findElement(password).sendKeys(pwd);
//    driver.findElement(signButton).click();
//    try {
//        Thread.sleep(3000);
//    }catch(InterruptedException e){
//        throw new RuntimeException(e);
//    }
//    String erro_message_text= driver.findElement(error_message).getText();
//    return erro_message_text;
//    }
////    public String loginToVEWOLoginValidId(String user,String password){
////
////        driver.get("https//app.vwo.com/");
////        driver.findElement(username).sendKeys("user");
////        driver.findElement(password).sendKeys("pas123");
////        driver.findElement(signButton).click();
////        try {
////            Thread.sleep(3000);
////        }catch(InterruptedException e){
////            throw new RuntimeException(e);
////        }
////        String erro_message_text= driver.findElement(error_message).getText();
////        return erro_message_text;
//   // }
//
//}
package com.kartik.Pages.pageObjectModel.vwo.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    WebDriver driver;
    // WebDriverWait wait;

    // Constructor : To pass the webdriver Instance
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        //  this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
    }


    // Page Locators (Fixed Incorrect XPath)
    private By username = By.xpath("//input[@id='login-username']");
    private By password = By.xpath("//input[@id='login-password']");
    private By signButton = By.xpath("//span[@data-qa='ezazsuguuy']");
    private By error_message = By.xpath("//div[@id='js-notification-box-msg']");

    // Method to perform login with invalid credentials
    public String loginToVEWOLoginInvalidId(String user, String pwd) {
        driver.get("https://app.vwo.com/#/login");

        // Wait for username field to be visible
        // wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        // Wait for error message and return its text
        //  WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(error_message));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String erro_message_text = driver.findElement(error_message).getText();
        return erro_message_text;
    }


    // Method to perform login with valid credentials
    public void loginToVWOLoginValidId(String user, String pwd) {
        driver.get("https://app.vwo.com/#/login");

       // wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
       driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Assuming valid login does not show an error message
    }

}