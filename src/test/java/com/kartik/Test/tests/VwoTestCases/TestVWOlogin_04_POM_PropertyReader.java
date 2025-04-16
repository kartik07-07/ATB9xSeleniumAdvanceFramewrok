package com.kartik.Test.tests.VwoTestCases;


import com.kartik.Pages.pageObjectModel.vwo.normal.DashBoardPage;
import com.kartik.Pages.pageObjectModel.vwo.normal.Loginpage;
import com.kartik.Utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

// Testcases
//To call the LoginpageINValid for this we have created this


public class TestVWOlogin_04_POM_PropertyReader {


    @Owner("Kartik")
    @Description()
    @Test
    public void test_login_VWO_page() throws Exception {
        WebDriver driver = new EdgeDriver();


        Loginpage loginpage_VWO = new Loginpage(driver);
        String error_message = loginpage_VWO.loginToVEWOLoginInvalidId(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
//

        assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_message, PropertiesReader.readKey("error_message"));

//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            new RuntimeException(e);
//        }
//
//     driver.quit();

    }


    //   Login:- contact+aug@thetestingacademy.com
    //     password:-  TtxkgQ!s$rJBk85


    //Positive Test Case
    @Owner("Kartik")
    @Description("Verify the vaild username ID")
    @Test
    public void testloginPositiveVWO() {
        WebDriver driver = new EdgeDriver();

        Loginpage loginpage_VWO = new Loginpage(driver);
        loginpage_VWO.loginToVWOLoginValidId(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));




        try{
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        String usernameLoggedIn = dashBoardPage.LoggedInUserName();

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn, PropertiesReader.readKey("expected_username"));
    }


    //Postive Test case1
//    @Owner("kartik")
//    @Description("Verify the test")
//    @Test
//
//    public void TestloginPositiveVWO1() {
//        WebDriver driver = new EdgeDriver();
//
//        Loginpage loginpage_VWO = new Loginpage(driver);
//        loginpage_VWO.loginToVWOLoginValidId("contact+aug@thetestingacademy.com", "TtxkgQ!s$rJBk85");
//
//
//        Test_Option testOption = new Test_Option(driver);
//        String usernameLoggedIn = Test_Option.LoggedInUserName();
//
//        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
//        Assert.assertEquals(usernameLoggedIn, "");
//    }



//    @Owner("Kartik")
//    @Description("Verify logged-in username from Test_Option page after successful login")
//    @Test
//    public void testLoginVWOValidCredentials_OptionPageCheck() {
//        WebDriver driver = new EdgeDriver();
//
//        Loginpage loginPageVWO = new Loginpage(driver);
//        loginPageVWO.loginToVWOLoginValidId(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
//
//        Test_Option testOption = new Test_Option(driver);
//        testOption.clickOntestingMenu();
//
//
//      testOption.clickOnABtestingMenu();
//
//
//        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
//        Assert.assertEquals(usernameLoggedIn,"Aman");
//
//    }

//    @Owner("Kartik")
//    @Description("Verify logged-in username from Test_Option page after successful login")
//    @Test
//    public void testLoginVWOValidCredentials_OptionPageCheck1() {
//        WebDriver driver = new EdgeDriver();
//
//        Loginpage loginPageVWO = new Loginpage(driver);
//        loginPageVWO.loginToVWOLoginValidId(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
//
//        Test_Option testOption = new Test_Option(driver);
//        testOption.clickOntestingMenu();
//
//        Actions action = new Actions(driver);
//
//       action
//               .keyUp(Keys.SHIFT).build().perform();


    }

