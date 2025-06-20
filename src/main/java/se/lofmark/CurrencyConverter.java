package se.lofmark;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CurrencyConverter {

    public static void runConverter() {

        LocalDateTime currentDateTime = LocalDateTime.now();
        String ISO = currentDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        Scanner sc = new Scanner(System.in);
        displayMenu();

        DataValidation kb = new DataValidation();

        int intInput2;
        String promptMsg3 = "Enter a number in the range (1-7): ";
        String errorMsg3 = "Error - Please enter a number in the range (1-7).";

        intInput2 = kb.readInteger(promptMsg3, errorMsg3, 1, 7);

        switch (intInput2) {

            case 1: {

                double doubleInput;
                String promptMsg2 = "Enter desired amount to convert: ";
                String errorMsg2 = "Error - Input is not a positive number, please enter a positive number.";

                doubleInput = kb.readDouble(promptMsg2, errorMsg2, 1, 999999999.999);

                System.out.println(doubleInput + " SEK is " + doubleInput * 0.09 + "€");
                System.out.println("Date and Time: " + ISO);

            }

            break;
            case 2: {

                double doubleInput;
                String promptMsg2 = "Enter desired amount to convert: ";
                String errorMsg2 = "Error - Input is not a positive number, please enter a positive number.";

                doubleInput = kb.readDouble(promptMsg2, errorMsg2, 1, 999999999.999);

                System.out.println(doubleInput + " SEK is "  + "$" + doubleInput*0.1);
                System.out.println("Date and Time: " + ISO);
            }

            break;
            case 3: {

                double doubleInput;
                String promptMsg2 = "Enter desired amount to convert: ";
                String errorMsg2 = "Error - Input is not a positive number, please enter a positive number.";

                doubleInput = kb.readDouble(promptMsg2, errorMsg2, 1, 999999999.999);

                System.out.println(doubleInput + " USD is " + doubleInput*9.64 + "kr");
                System.out.println("Date and Time: " + ISO);
            }

            break;
            case 4: {

                double doubleInput;
                String promptMsg2 = "Enter desired amount to convert: ";
                String errorMsg2 = "Error - Input is not a positive number, please enter a positive number.";

                doubleInput = kb.readDouble(promptMsg2, errorMsg2, 1, 999999999.999);

                System.out.println(doubleInput + " USD is " + doubleInput*0.87 + "€");
                System.out.println("Date and Time: " + ISO);
            }

            break;
            case 5: {

                double doubleInput;
                String promptMsg2 = "Enter desired amount to convert: ";
                String errorMsg2 = "Error - Input is not a positive number, please enter a positive number.";

                doubleInput = kb.readDouble(promptMsg2, errorMsg2, 1, 999999999.999);

                System.out.println(doubleInput + " EUR is " + doubleInput*11.07 + "kr");
                System.out.println("Date and Time: " + ISO);
            }

            break;
            case 6: {

                double doubleInput;
                String promptMsg2 = "Enter desired amount to convert: ";
                String errorMsg2 = "Error - Input is not a positive number, please enter a positive number.";

                doubleInput = kb.readDouble(promptMsg2, errorMsg2, 1, 999999999.999);

                System.out.println(doubleInput + " EUR is " + "$" + doubleInput*1.15);
                System.out.println("Date and Time: " + ISO);
            }

            break;
            case 7: {
                System.out.println("Exiting the currency converter. Goodbye!");
                System.out.println("Date and Time: " + ISO);
            }
        }
    }

    private static void displayMenu() {

        System.out.println("Welcome to the currency converter tool!");
        System.out.println("Please choose one of the following options.");
        System.out.println("------------------------------------------");
        System.out.println("1) SEK to EUR");
        System.out.println("2) SEK to USD");
        System.out.println("3) USD to SEK");
        System.out.println("4) USD to EUR");
        System.out.println("5) EUR to SEK");
        System.out.println("6) EUR to USD");
        System.out.println("7) Exit");
        System.out.println("------------------------------------------");
    }
}