package com.github.e999or.lesson28;

public class PostCount {

    private static PostCount INST;
    private static String postC;

    public static PostCount getINST() {
        if (INST == null) {
            INST = new PostCount();
        }
        return INST;
    }

    public void setINST(String k) {
        postC = k;
    }

    public static String getPostC() {
        return postC;
    }

}
