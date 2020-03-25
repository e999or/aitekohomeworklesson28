package com.github.e999or.lesson28;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FactoryAvtoPage extends PostCount {

    String checkButton;
    String carBrandName;

    public FactoryAvtoPage checkButtonFactoryAP() {
        checkButton = $x("//span[@class='ButtonWithLoader__content']").getAttribute("innerText").replaceAll("\\D+", "");
        Assert.assertEquals(checkButton, PostCount.getPostC());
        return this;
    }

    public FactoryAvtoPage checkPostFactoryAP(String carBrand) {
        PostCount.getINST().setINST($x("//div/a[text()[contains(.,'" + carBrand + "')]]/following::div").getAttribute("innerText"));
        this.carBrandName = carBrand;
        return this;
    }

    public FactoryAvtoPage openPageCB() {
        $(By.linkText(carBrandName)).click();
        return this;
    }

}
