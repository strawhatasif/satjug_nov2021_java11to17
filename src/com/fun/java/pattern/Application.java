package com.fun.java.pattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you an employee? ");
        var employeeIndicator = input.nextLine();
        System.out.println("What is your name? ");
        var name = input.nextLine();
        input.close();

        boolean employee = "yes".equalsIgnoreCase(employeeIndicator) || "y".equalsIgnoreCase(employeeIndicator);
        var greeting = "";
        if (employee) {
            //Before Java 16 - uncomment for demo
            //greeting = displayAppropriateGreetingBeforeJava16(new Employee(), name;
            greeting = displayAppropriateGreeting(new Employee(), name);
        }
        else {
            //Before Java 16 - uncomment for demo
            //greeting = displayAppropriateGreetingBeforeJava16(new Customer(), name;
            greeting = displayAppropriateGreeting(new Customer(), name);
        }

        System.out.println(greeting);
    }

    private static String displayAppropriateGreeting(Person person, String name) {
        var greeting = "";
        if (person instanceof Customer customer) {
            greeting = customer.customerGreeting(name);
        }
        else if (person instanceof Employee employee) {
            greeting = employee.employeeGreeting(name);
        }

        return greeting;
    }

    /**
     * Before Java 16
     * @param person - Instance of Person, can be Customer or Employee
     * @param name - name of Person, can be for Customer or Employee
     * @return greeting
     */
    private static String displayAppropriateGreetingBeforeJava16(Person person, String name) {
        var greeting = "";

        if (person instanceof Customer) {
            greeting = ((Customer) person).customerGreeting(name);
        }
        else if(person instanceof Employee) {
            greeting = ((Employee) person).employeeGreeting(name);
        }

        return greeting;
    }
}
