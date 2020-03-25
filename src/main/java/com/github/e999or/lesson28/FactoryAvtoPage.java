package com.github.e999or.lesson28;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FactoryAvtoPage extends AbstractPage {
    String checkButton;
    String countPostsCarBrend;
    String carBrandName;


    public FactoryAvtoPage checkButtonContentFactoryAvtoPage() throws InterruptedException {
        checkButton =$x("//span[@class='ButtonWithLoader__content']").getAttribute("innerText").replaceAll("\\D+","");
        String s = checkButton;
        System.out.println("cbut="+s+" test" + countPosts);
        Assert.assertEquals(s, countPosts);
        return this;
    }

    public FactoryAvtoPage checkPostFactoryAvtoPage(String carBrand) {
        countPostsCarBrend = $x("//div/a[text()[contains(.,'" + carBrand + "')]]/following::div").getAttribute("innerText");
        this.carBrandName = carBrand;
        return this;
    }

    public FactoryAvtoPage openPageCarBrend() {
        $(By.linkText(carBrandName)).click();
        return this;
    }

}
