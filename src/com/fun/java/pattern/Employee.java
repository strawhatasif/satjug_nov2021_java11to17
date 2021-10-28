package com.fun.java.pattern;

final class Employee extends Person {

    String employeeGreeting(String name) {
        return "Welcome to Pepperstaffere Corporation, " + name +
                "! Information systems use is monitored and users should not have any expectations of privacy.";
    }
}
