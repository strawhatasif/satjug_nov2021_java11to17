package com.fun.java.sealed;

import java.math.BigDecimal;

//Only permits IndividualContributor.java and Manager.java to extend
sealed class Employee permits IndividualContributor, Manager {
    BigDecimal determineBonus(double salary) {
        return BigDecimal.valueOf(0);
    }
}
