package com.fun.java.record;

/**
 * Note: Prior to Record in Java 15, to create an immutable Plain Old Java Object (POJO) one would have to either:
 * 1. manually create an object with final attributes
 * 2. OR, use the @Value annotation from Lombok - https://projectlombok.org/features/Value
 */
public class SpinningThatRecord {
    public static void main(String[] args) {
        getEmployeeData();
        getCustomerData();
    }

    private static void getEmployeeData() {
        Employee employee = new Employee(11750, "Rachel Belle Pepperstaffere");

        //NOTE: to access properties from record classes one does NOT include get for the getter.
        System.out.println("The employee's name is " + employee.name()
                + " and their employee ID is: " + employee.employeeID());

        //Demonstrating toString (generated by the record class).
        System.out.println(new Employee(22556, "Laura Feathers"));
    }

    private static void getCustomerData() {
        //This will leverage and overridden toString method
        System.out.println(new Customer("f8f629a0-fe92-11ea-adc1-0242ac120002", "Samuel Red"));
    }
}
