package com.java.features.jdk14;

public class SwitchExpression {

    //enum
    enum DaysOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        String input = "8";

        if (input.equals("1")) {
            System.out.println("Monday");
        } else if (input.equals("2")) {
            System.out.println("Tuesday");
        } else if (input.equals("3")) {
            System.out.println("Wednesday");
        } else if (input.equals("4")) {
            System.out.println("Thursday");
        } else if (input.equals("5")) {
            System.out.println("Friday");
        } else if (input.equals("6")) {
            System.out.println("Saturday");
        } else if (input.equals("7")) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid selection, valid choices 1-7");
        }

        //Switch
        System.out.println("Normal Switch:");
        switch (input) {
            case "1" -> System.out.println("Sunday");
            case "2" -> System.out.println("Monday");
            case "3" -> System.out.println("Tuesday");
            case "4" -> System.out.println("Wednesday");
            case "5" -> System.out.println("Thursday");
            case "6" -> System.out.println("Friday");
            case "7" -> System.out.println("Saturday");
            default -> System.out.println("Invalid selection, valid choices 1-7");
        }

        //Switch Return
        String result = switch (input) {
            case "1" -> "Sunday";
            case "2" -> "Monday";
            case "3" -> "Tuesday";
            case "4" -> "Wednesday";
            case "5" -> "Thursday";
            case "6" -> "Friday";
            case "7" -> "Saturday";
            default -> "Invalid Choice";
        };

        System.out.println("Switch Return:" + result);

        //Block Cases: A case can also be expressed in a code block if multiple statements need to be executed for a case:

        String result1 = switch (input) {
            case "1" -> "Sunday";
            case "2" -> "Monday";
            case "3" -> "Tuesday";
            case "4" -> "Wednesday";
            case "5" -> "Thursday";
            case "6" -> "Friday";
            case "7" -> "Saturday";
            default -> {
                System.out.println("Invalid selection, valid choices 1-7");
                yield "Invalid Choice";
            }
        };
        DaysOfWeek dayOfWeek = DaysOfWeek.FRIDAY;

        String result2 = switch (dayOfWeek) {
            case SUNDAY -> "Sunday";
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            case SATURDAY -> "Saturday";
        };
        System.out.println(result2);

    }

}
