package com.fun.java.sealed;

public class Supervisor {
    //nothing special
}

//Uncomment this block of code to see the error regarding permitted classes
// "SupervisorRole is not allowed in the sealed hierarchy"
/*
public final class SupervisorRole extends Employee {
    @Override
    public BigDecimal determineBonus(double salary) {
        return null;
    }
}
*/
