package com.advantageonlineshopping.utils;

public class CustomerRegistrationData {

    //Variables
    String UserName;
    String Email;
    String Password;
    String ConfirmPassword;
    String FirstName;
    String LastName;
    String PhoneNumeber;
    String City;
    String Address;
    String State;
    String PostalCode;

    public CustomerRegistrationData() {
        UserName = "Iandres20";
        Email = "iandresrs@gmail.com";
        Password = "Rojo333";
        ConfirmPassword = "Rojo333";
        FirstName = "Andres";
        LastName = "Rincon";
        PhoneNumeber = "4930123450";
        City = "Cucuta";
        Address = "av siempre viva 123";
        State = "NSantander";
        PostalCode = "5400001";
    }

    //Getters
    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNumeber() {
        return PhoneNumeber;
    }

    public String getCity() {
        return City;
    }

    public String getAddress() {
        return Address;
    }

    public String getState() {
        return State;
    }

    public String getPostalCode() {
        return PostalCode;
    }
}
