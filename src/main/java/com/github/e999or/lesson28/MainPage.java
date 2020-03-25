package com.github.e999or.lesson28;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends PostCount {

    String nameFactory;

    public MainPage openAvtoMP() {
        Selenide.open("https://www.auto.ru");
        return this;
    }

    public MainPage chekTitleMP(String titleText) {
        String s = $("title").getAttribute("text");
        Assert.assertTrue(s.contains(titleText));
        return this;
    }

    public void getCountPost(String nameFactory) {
        PostCount.getINST().setINST($x("//a/div[text()[contains(.,'" + nameFactory + "')]]/following::div").getAttribute("innerText"));
        this.nameFactory = nameFactory;
    }

    public MainPage clickFactoryAP() {
        $x("//a/div[text()[contains(.,'" + nameFactory + "')]]/following::div").click();
        return this;
    }
}
