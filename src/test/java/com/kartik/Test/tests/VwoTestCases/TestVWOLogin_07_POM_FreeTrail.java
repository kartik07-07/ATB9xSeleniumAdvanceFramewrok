package com.kartik.Test.tests.VwoTestCases;

import com.kartik.Driver.DriverManager;
import com.kartik.Driver.DriverManagerTL;
import com.kartik.Pages.pageObjectModel.vwo.normal.FreeTrialPage;
import com.kartik.Pages.pageObjectModel.vwo.normal.Loginpage;
import com.kartik.Pages.pageObjectModel.vwo.normal.SignupPage;
import com.kartik.Test.base.commonToallTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;



public class TestVWOLogin_07_POM_FreeTrail extends commonToallTest {


    @Owner("Kartik")
    @Description()
    @Test
    public void testBusinessemail(){
        WebDriver driver = new EdgeDriver();

        FreeTrialPage freeTrialPage = new FreeTrialPage(driver);
        freeTrialPage.StartFreeTrial();

    }


    @Owner("Kartik")
    @Description()
    @Test
    public void testBusinessemail1(){
        WebDriver driver = new EdgeDriver();

        FreeTrialPage freeTrialPage = new FreeTrialPage(driver);
        freeTrialPage.StartFreeTrial();

        SignupPage signupPage = new SignupPage(driver);
        signupPage.enterEmail("kartikbhoyar@1234");
        signupPage.clickCheckbox();
        signupPage.clickCreateAccount();


        driver.quit();

    }

}
