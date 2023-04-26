package com.advantageonlineshopping.steps;

import com.advantageonlineshopping.pageObjects.LoginPageObject;
import com.advantageonlineshopping.pageObjects.UserRegistrationPageObject;
import com.advantageonlineshopping.utils.CustomerRegistrationData;
import com.sqasa.web.demo.utils.KrakenWeb;
import net.thucydides.core.annotations.Step;

public class LoginStep extends KrakenWeb {
    LoginPageObject loginPageObject = new LoginPageObject();
    UserRegistrationPageObject userRegistrationPageObject = new UserRegistrationPageObject();
    CustomerRegistrationData customerRegistrationData = new CustomerRegistrationData();

    @Step
    public void openBrowser(){
        configuracionesIniciales();
        abrirNavegadorEn(loginPageObject);
    }

    @Step
    public void enterCredentials(){
        click(userRegistrationPageObject.getBtn_newUser());
        waitABit(1000);
        //Credentials
        escribirTexto(loginPageObject.getTxt_UserName(), customerRegistrationData.getUserName());
        escribirTexto(loginPageObject.getTxt_Password(),customerRegistrationData.getPassword());

        //Confirm
        click(loginPageObject.getBtn_SingIn());
        waitABit(2000);
    }

}
