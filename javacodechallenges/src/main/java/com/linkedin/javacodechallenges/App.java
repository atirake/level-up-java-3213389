package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if (password.length() < 6) {
            return false;
        } else {
            boolean upperCheck = false;
            for (char ch : password.toCharArray()) {
                if (ch >= 65 && ch <= 90) {
                    upperCheck = true;
                    break;
                }
            }
            if (!upperCheck) {
                return false;
            } else {
                boolean lowerCheck = false;
                for (char ch : password.toCharArray()) {
                    if (ch >= 97 && ch <= 122) {
                        lowerCheck = true;
                        break;
                    }
                }
                if (!lowerCheck) {
                    return false;
                }
                else {
                    boolean numberCheck = false;
                    for (char ch : password.toCharArray()) {
                        if (ch >= 48 && ch <= 57) {
                            numberCheck = true;
                            break;
                        }
                    }
                    if (!numberCheck) {
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
