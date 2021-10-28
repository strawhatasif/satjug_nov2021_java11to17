package com.fun.java.switchfun;

public class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Name of day? " + getNameOfDayOfWeek(3));
        System.out.println("Day of week? " + getDayOfWeekBasedOnName("Friday"));
    }

    /**
     * This leverages the "traditional" switch statement that was present in Java 11 and earlier.
     *
     * Returns the name of the day of week based on the number of the day.
     * Example: 1 would return Monday.
     *
     * @param dayOfWeek
     * @return nameOfDayWeek
     */
    private static String getNameOfDayOfWeek(int dayOfWeek) {
        String nameOfDay = "";
        switch (dayOfWeek) {
            case 1:
                nameOfDay = "Monday";
                break;
            case 2:
                nameOfDay = "Tuesday";
                break;
            case 3:
                nameOfDay = "Wednesday";
                break;
            case 4:
                nameOfDay = "Thursday";
                break;
            case 5:
                nameOfDay = "Friday";
                break;
            case 6:
                nameOfDay = "Saturday";
                break;
            case 7:
                nameOfDay = "Sunday";
                break;
        }

        return nameOfDay;
    }

    /**
     * This uses the standard functionality in Java 14 (which was a preview in Java 12 and 13)
     * for a switch statement.
     *
     * Returns the day of week numeric value based on the name of the day of week.
     * Example: 2 would return Tuesday.
     *
     * @param nameOfDay
     * @return dayOfWeek
     */
    private static int getDayOfWeekBasedOnName(String nameOfDay) {
        int dayOfWeek = switch(nameOfDay) {
            case "Monday":
                yield 1;
            case "Tuesday":
                yield 2;
            case "Wednesday":
                yield 3;
            case "Thursday":
                yield 4;
            case "Friday":
                yield 5;
            case "Saturday":
                yield 6;
            case "Sunday":
                yield 7;
            default:
                yield -1;
        };

        return dayOfWeek;
    }
}
