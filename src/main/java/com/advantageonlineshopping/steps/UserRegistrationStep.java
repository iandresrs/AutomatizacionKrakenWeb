package com.advantageonlineshopping.steps;

import com.advantageonlineshopping.pageObjects.UserRegistrationPageObject;
import com.advantageonlineshopping.utils.CustomerRegistrationData;
import com.sqasa.web.demo.utils.KrakenWeb;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class UserRegistrationStep extends KrakenWeb {

    UserRegistrationPageObject userRegistrationPageObject = new UserRegistrationPageObject();
    CustomerRegistrationData customerRegistrationData = new CustomerRegistrationData();
    @Step
    public void openBrowser(){
        configuracionesIniciales();
        abrirNavegadorEn(userRegistrationPageObject);
        waitABit(3000);
    }

    @Step
    public void clickNewUser(){
        click(userRegistrationPageObject.getBtn_newUser());
        waitABit(1000);
        click(userRegistrationPageObject.getBtn_createAccount());
        waitABit(3000);
    }

    @Step
    public void writeUserData(){
        //Account Details
        escribirTexto(userRegistrationPageObject.getTxt_UserName(), customerRegistrationData.getUserName());
        escribirTexto(userRegistrationPageObject.getTxt_Email(), customerRegistrationData.getEmail());
        escribirTexto(userRegistrationPageObject.getTxt_Password(),customerRegistrationData.getPassword());
        escribirTexto(userRegistrationPageObject.getTxt_ConfirmPassword(),customerRegistrationData.getConfirmPassword());

        //Personal Details
        escribirTexto(userRegistrationPageObject.getTxt_FirstName(),customerRegistrationData.getFirstName());
        escribirTexto(userRegistrationPageObject.getTxt_LastName(),customerRegistrationData.getLastName());
        escribirTexto(userRegistrationPageObject.getTxt_PhoneNumber(),customerRegistrationData.getPhoneNumeber());

        //Address
        click(userRegistrationPageObject.getLst_Country());
        click(userRegistrationPageObject.getLv_ItemCountry());
        escribirTexto(userRegistrationPageObject.getTxt_City(), customerRegistrationData.getCity());
        escribirTexto(userRegistrationPageObject.getTxt_Address(), customerRegistrationData.getAddress());
        escribirTexto(userRegistrationPageObject.getTxt_State(), customerRegistrationData.getState());
        escribirTexto(userRegistrationPageObject.getTxt_PostalCode(), customerRegistrationData.getPostalCode());

        //Confirm
        click(userRegistrationPageObject.getChk_Igree());
        click(userRegistrationPageObject.getBtn_Register());
        waitABit(5000);

    }

    @Step
    public void validateUser(){
        Assert.assertThat(userRegistrationPageObject.getDriver().
                findElement(userRegistrationPageObject.getVs_ValidateUser()).isDisplayed(), Matchers.is(true));
    }
}
