package com.advantageonlineshopping.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {

    //credentials
    By txt_UserName = By.name("username");
    By txt_Password = By.name("password");

    By btn_SingIn = By.id("sign_in_btnundefined");

    //Getters

    public By getTxt_UserName() {
        return txt_UserName;
    }

    public By getTxt_Password() {
        return txt_Password;
    }

    public By getBtn_SingIn() {
        return btn_SingIn;
    }
}
