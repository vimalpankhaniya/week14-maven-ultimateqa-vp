package com.altimateqa.courses.testsuit;

import com.altimateqa.courses.pages.HomePage;
import com.altimateqa.courses.pages.LoginPage;
import com.altimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnSignInButton();

        Assert.assertEquals(loginPage.getLoginText(), "Welcome Back!", "not Verified");

    }

    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSignIn();
        loginPage.enterUserName("vimal@hotmail.co.uk");
        loginPage.enterPassword("Vipal123");
        loginPage.clickOnSignInButton();

        String expectedText = "Invalid email or password.";
        String actualText = loginPage.verifyErrorMessage();
       Assert.assertEquals(actualText,expectedText,"Invalid email or password.");
    }



}





