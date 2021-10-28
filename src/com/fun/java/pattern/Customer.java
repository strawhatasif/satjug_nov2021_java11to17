package com.fun.java.pattern;

public class Customer extends Person{

    String customerGreeting(String name) {
        return "Welcome, " + name + "! As a valued customer of Pepperstaffere, " +
                " we are awarding you with a $25 gift card!";
    }
}
