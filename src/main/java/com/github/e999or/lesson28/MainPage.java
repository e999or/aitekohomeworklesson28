package com.github.e999or.lesson28;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends AbstractPage{

    String countCarFactory;
    String nameFactory;


    public MainPage openAvtoMainPage() {
        Selenide.open("https://www.auto.ru");
        return this;
    }

    public MainPage chekTitleMainPage(String titleText) {
        String s = $("title").getAttribute("text");
        Assert.assertTrue(s.contains(titleText));
        return this;
    }

    public void getCountPost(String nameFactory){
        getCountPostAP(nameFactory);
        System.out.println(countPosts);
        this.nameFactory = nameFactory;
    }

    public MainPage clickFactoryAvtoPage(){
        $x("//a/div[text()[contains(.,'"+ nameFactory + "')]]/following::div").click();
        return this;
    }
}
