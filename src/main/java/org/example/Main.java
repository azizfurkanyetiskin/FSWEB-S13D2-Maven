package org.example;

public class Main {

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String result = "";
        String numberText = String.valueOf(number);

        for (int i = 0; i < numberText.length(); i++) {
            char digit = numberText.charAt(i);

            switch (digit) {
                case '0':
                    result += "Zero";
                    break;
                case '1':
                    result += "One";
                    break;
                case '2':
                    result += "Two";
                    break;
                case '3':
                    result += "Three";
                    break;
                case '4':
                    result += "Four";
                    break;
                case '5':
                    result += "Five";
                    break;
                case '6':
                    result += "Six";
                    break;
                case '7':
                    result += "Seven";
                    break;
                case '8':
                    result += "Eight";
                    break;
                case '9':
                    result += "Nine";
                    break;
            }

            if (i < numberText.length() - 1) {
                result += " ";
            }
        }

        return result;
    }
}