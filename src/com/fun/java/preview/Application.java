package com.fun.java.preview;

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

        //Using Java 17 "preview language feature" - pattern matching in a switch statement
        BigDecimal bonus = memberOfManagement ? determineBonusAmount(new ManagementRole(), salary) : determineBonusAmount(new IndividualContributorRole(), salary);
        System.out.println("A different method. Your estimated bonus is: " + numberFormat.format(bonus));
    }

    // WARNING! this uses the Java 17 preview language feature - pattern matching in a switch statement
    private static BigDecimal determineBonusAmount(Object o, double salary) {
        //Individual contributors are awarded a 10% bonus, members of management are awarded a 25% bonus
        final double INDIVIDUAL_CONTRIBUTOR_PERCENTAGE = 0.1;
        final double MANAGER_PERCENTAGE = 0.25;

        return switch (o) {
            case IndividualContributorRole individualContributorRole -> individualContributorRole.determineBonus(INDIVIDUAL_CONTRIBUTOR_PERCENTAGE * salary);
            case ManagementRole managementRole -> managementRole.determineBonus(MANAGER_PERCENTAGE * salary);
            default -> BigDecimal.valueOf(0);
        };
    }
}
