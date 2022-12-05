package com.altimateqa.courses.pages;

import com.altimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signin = By.linkText("Sign In");

    public void clickOnSignIn(){
        clickOnElement(signin);
    }
}
