package com.fun.java.record;

/**
 * Records are amazing! They reduce the amount of code/clicks a Programmer needs to perform for a data class!!!
 *
 * Record classes are immutable (no setters, all values passed in are final).
 */
public record Customer (String customerID, String name) {
    //Demonstrating the ability to override toString
    //The default behavior is Customer[ID=12345, name=Jane Smith]
    @Override
    public String toString() {
        return "The customer's name is " + name +
                " and their customer ID is: " + customerID;
    }
}
