package com.fun.java.sealed;

import java.math.BigDecimal;

//Classes extending sealed classes are required to be final
public final class Manager extends Employee {

    //Members of management are awarded a 25% bonus
    public static final double MANAGER_PERCENTAGE = 0.25;

    @Override
    BigDecimal determineBonus(double salary) {
        return BigDecimal.valueOf(salary * MANAGER_PERCENTAGE);
    }
}
