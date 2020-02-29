package com.thobho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(int min, int max) {

        boolean areInputValid = true;
        int valueToReturn = 0;

        do {
            try {
                valueToReturn = scanner.nextInt();
                if (valueToReturn < min || valueToReturn > max) {
                    System.out.println("Wybierz wartość pomiędzy " + min + " i " + max);
                    areInputValid = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Błędne dane. Spróbuj jeszcze raz");
                areInputValid = false;
            }

        } while (!areInputValid);

        return valueToReturn;
    }
}
