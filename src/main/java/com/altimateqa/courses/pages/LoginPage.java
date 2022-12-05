package com.altimateqa.courses.pages;

import com.altimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[normalize-space()='Welcome Back!']");
    By signin = By.linkText("Sign In");
    By loginText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailFiled = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By errorMessage = By.xpath("//li[@class='form-error__list-item']");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    public void clickOnSignInButton() {
        clickOnElement(signin);
    }
    public String getLoginText() {
        return getTextFromElement(loginText);
    }

    public void enterUserName(String email) {
        sendTextToElement(emailFiled, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }
    public String getErrorMessage (){
        return getTextFromElement(errorMessage);

    }

    public String verifyErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}


