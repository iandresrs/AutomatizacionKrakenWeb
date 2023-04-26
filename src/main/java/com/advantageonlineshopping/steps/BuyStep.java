package com.advantageonlineshopping.steps;

import com.advantageonlineshopping.pageObjects.BuyPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class BuyStep extends KrakenWeb {

    BuyPageObject buyPageObject = new BuyPageObject();

    @Step
    public void clickLaptop() {
        click(buyPageObject.getBtnLaptops());
        waitABit(5000);
    }

    @Step
    public void selectLaptop() {
        List<String> list = new ArrayList<>();
        list.add((getDriver().findElement(buyPageObject.getLblLaptops()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsDos()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsTres()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsCuatro()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsCinco()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsSeis()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsSiete()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsOcho()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsNueve()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsDiez()).getText()));
        list.add((getDriver().findElement(buyPageObject.getLblLaptopsOnce()).getText()));
        System.out.println(list);
    }

    @Step
    public void clicLaptop() {
        click(buyPageObject.getBtnLaptop());
        click(buyPageObject.getBtnAddCar());
        click(buyPageObject.getBtnCar());
        waitABit(3000);
        click(buyPageObject.getBtnCheckOut());
        waitABit(3000);
        click(buyPageObject.getBtnNext());
    }

    @Step
    public void purchaseFlow(){
        clickLaptop();
        selectLaptop();
        clicLaptop();
    }

    @Step
    public void validation() {
        waitABit(5000);

        Assert.assertThat(buyPageObject.getDriver().
                findElement(buyPageObject.getLblConfirmar()).isDisplayed(), Matchers.is(true));
    }
}
