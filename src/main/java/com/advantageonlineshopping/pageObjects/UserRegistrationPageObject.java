package com.advantageonlineshopping.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class UserRegistrationPageObject extends PageObject {

    //Home Page
    By btn_newUser = By.id("menuUserLink");
    By btn_createAccount = By.xpath("//a[@class='create-new-account ng-scope']");

    //Form
    By txt_UserName = By.name("usernameRegisterPage");
    By txt_Email = By.name("emailRegisterPage");
    By txt_Password = By.name("passwordRegisterPage");
    By txt_ConfirmPassword = By.name("confirm_passwordRegisterPage");

    //Personal Details
    By txt_FirstName = By.name("first_nameRegisterPage");
    By txt_LastName = By.name("last_nameRegisterPage");
    By txt_PhoneNumber = By.name("phone_numberRegisterPage");

    //Address
    By lst_Country = By.name("countryListboxRegisterPage");
    By lv_ItemCountry = By.xpath("//option[@label='Colombia']");

    By txt_City = By.name("cityRegisterPage");
    By txt_Address = By.name("addressRegisterPage");
    By txt_State = By.name("state_/_province_/_regionRegisterPage");
    By txt_PostalCode = By.name("postal_codeRegisterPage");
    By btn_Register = By.id("register_btnundefined");
    By chk_Igree = By.name("i_agree");

    //Validate User
    By vs_ValidateUser = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");

    //Metodos Getters
    public By getBtn_newUser() {
        return btn_newUser;
    }

    public By getBtn_createAccount() {
        return btn_createAccount;
    }

    public By getTxt_UserName() {
        return txt_UserName;
    }

    public By getTxt_Email() {
        return txt_Email;
    }

    public By getTxt_Password() {
        return txt_Password;
    }

    public By getTxt_ConfirmPassword() {
        return txt_ConfirmPassword;
    }

    public By getTxt_FirstName() {
        return txt_FirstName;
    }

    public By getTxt_LastName() {
        return txt_LastName;
    }

    public By getTxt_PhoneNumber() {
        return txt_PhoneNumber;
    }

    public By getLst_Country() {
        return lst_Country;
    }

    public By getLv_ItemCountry() {
        return lv_ItemCountry;
    }

    public By getTxt_City() {
        return txt_City;
    }

    public By getTxt_Address() {
        return txt_Address;
    }

    public By getTxt_State() {
        return txt_State;
    }

    public By getTxt_PostalCode() {
        return txt_PostalCode;
    }

    public By getBtn_Register() {
        return btn_Register;
    }

    public By getChk_Igree() {
        return chk_Igree;
    }

    public By getVs_ValidateUser() {
        return vs_ValidateUser;
    }
}
