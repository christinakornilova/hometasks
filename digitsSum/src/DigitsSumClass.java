/*
8. Реализовать функцию по нахождению сумм цифр в числе без использования класса String или массивов типа char (123->6, 202->4).
 */

import java.util.Scanner;

public class DigitsSumClass {

    public static boolean isInt(String x) throws NumberFormatException
    {
        try {
            Integer.parseInt(x);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static boolean isPositive(String x)
    {
        try {
            return (Integer.parseInt(x) > 0);
        } catch(Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s; //for user input
        int x = 0, sum = 0;
        try {
            //user input
            do {
                System.out.println("Enter int value (only positive values accepted):");
                s = in.next();
            } while (!isInt(s) || !isPositive(s));


            //calculation
            if (isInt(s)){
                x = Integer.parseInt(s);
                while (x != 0) {
                    sum = sum + x % 10;
                    x = x / 10;
                }
                System.out.println("Digits sum of " + Integer.parseInt(s) + " is " + sum);
            }

        } catch (Exception e) {
            System.err.println("Invalid entered data.");
        }
    }
}
