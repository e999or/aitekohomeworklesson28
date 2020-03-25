package com.github.e999or.lesson28;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class CarBrendPage extends PostCount {

    String checkButton;

    public void checkButtonCarBP() {
       checkButton = $x("//span[@class='ButtonWithLoader__content']").getAttribute("innerText").replaceAll("\\D+","");
       Assert.assertEquals(checkButton, PostCount.getPostC());
    }
}
