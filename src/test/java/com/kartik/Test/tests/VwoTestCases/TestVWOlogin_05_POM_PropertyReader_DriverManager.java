package com.kartik.Test.tests.VwoTestCases;

import com.kartik.Driver.DriverManager;
import com.kartik.Pages.pageObjectModel.vwo.normal.DashBoardPage;
import com.kartik.Pages.pageObjectModel.vwo.normal.Loginpage;
import com.kartik.Test.base.commonToallTest;
import com.kartik.Utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.kartik.Driver.DriverManager.driver;
import static java.lang.Thread.sleep;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setAllowComparingPrivateFields;
import static org.testng.AssertJUnit.assertEquals;

public class TestVWOlogin_05_POM_PropertyReader_DriverManager extends commonToallTest {


    @Owner("kartik")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginNegativeVWO() {

        Loginpage loginPage_VWO = new Loginpage(DriverManager.getDriver());
        String error_msg = loginPage_VWO.loginToVEWOLoginInvalidId(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));


        // Assertion AssertJ
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();

        // Assertion TestNG
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));


    }
  //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Owner("kartik")
    @Description
    @Test
    public void testLoginPositiveVWO() {


        Loginpage loginpage_VWO = new Loginpage(DriverManager.getDriver());

        loginpage_VWO.loginToVWOLoginValidId(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));


        DashBoardPage dashBoardPage = new DashBoardPage(DriverManager.getDriver());
        String usernameLoggedIn = dashBoardPage.LoggedInUserName();


        assertThat(usernameLoggedIn).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));


    }

}

