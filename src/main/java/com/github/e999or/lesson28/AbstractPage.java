package com.github.e999or.lesson28;

import static com.codeborne.selenide.Selenide.$x;

public class AbstractPage {

    String countPosts;

    public void getCountPostAP(String nameFactory){
        countPosts = $x("//a/div[text()[contains(.,'"+ nameFactory + "')]]/following::div").getAttribute("innerText");
    }

}
