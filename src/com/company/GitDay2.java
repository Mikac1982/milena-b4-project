package com.company;

public class GitDay2 {
    public static void main(String[] args) {
        System.out.println("Good morning! It's a Git Day 2");
        System.out.println(revStr("Hello World"));
    }

    public static String revStr(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
