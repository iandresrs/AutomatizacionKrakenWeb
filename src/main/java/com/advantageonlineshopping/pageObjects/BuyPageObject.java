package com.advantageonlineshopping.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuyPageObject extends PageObject {
    By btnLaptops = By.xpath("//span[@id='laptopsTxt']");
    By lblLaptops = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[1]");
    By lblLaptopsDos = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[2]");
    By lblLaptopsTres = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[3]");
    By lblLaptopsCuatro = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[4]");
    By lblLaptopsCinco = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[5]");
    By lblLaptopsSeis = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[6]");
    By lblLaptopsSiete = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[7]");
    By lblLaptopsOcho = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[8]");
    By lblLaptopsNueve = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[9]");
    By lblLaptopsDiez = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[10]");
    By lblLaptopsOnce = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[11]");
    By btnLaptop = By.xpath("(//ul//li[@class='ng-scope']//p//a[@class='productName ng-binding'])[3]");
    By btnCar = By.xpath("//a[@id='shoppingCartLink']");

    By btnAddCar = By.xpath("//button[@name='save_to_cart']");

    By btnCheckOut = By.xpath("//button[@data-ng-click='checkout()']");

    By btnNext = By.xpath("//button[@id='next_btn']");

    By lblConfirmar = By.xpath("(//tr[@id='product']//ancestor::td//a//h3)[2]");

    public By getBtnLaptops() {
        return btnLaptops;
    }

    public By getLblLaptops() {
        return lblLaptops;
    }

    public By getLblLaptopsDos() {
        return lblLaptopsDos;
    }

    public By getLblLaptopsTres() {
        return lblLaptopsTres;
    }

    public By getLblLaptopsCuatro() {
        return lblLaptopsCuatro;
    }

    public By getLblLaptopsCinco() {
        return lblLaptopsCinco;
    }

    public By getLblLaptopsSeis() {
        return lblLaptopsSeis;
    }

    public By getLblLaptopsSiete() {
        return lblLaptopsSiete;
    }

    public By getLblLaptopsOcho() {
        return lblLaptopsOcho;
    }

    public By getLblLaptopsNueve() {
        return lblLaptopsNueve;
    }

    public By getLblLaptopsDiez() {
        return lblLaptopsDiez;
    }

    public By getLblLaptopsOnce() {
        return lblLaptopsOnce;
    }

    public By getBtnLaptop() {
        return btnLaptop;
    }

    public By getBtnCar() {
        return btnCar;
    }

    public By getBtnAddCar() {
        return btnAddCar;
    }

    public By getBtnCheckOut() {
        return btnCheckOut;
    }

    public By getBtnNext() {
        return btnNext;
    }

    public By getLblConfirmar() {
        return lblConfirmar;
    }
}
