package com.fun.java.sealed;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a member of management? ");
        var managementIndicator = input.nextLine();
        System.out.println("What is your annual salary? ");
        var salary = input.nextDouble();
        input.close();

        boolean memberOfManagement = "yes".equalsIgnoreCase(managementIndicator);

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Your estimated bonus is: " + numberFormat.format(determineBonus(salary, memberOfManagement)));
    }

    private static BigDecimal determineBonus(double salary, boolean managementIndicator) {
        return managementIndicator ? new Manager().determineBonus(salary) : new IndividualContributor().determineBonus(salary);
    }
}
