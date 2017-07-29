/*
6. Ввести число, определить простое ли оно.
 */

import java.util.Scanner;

public class PrimesMainClass {

    public static boolean isPrime(long n) {

        if (n == 1) // 1 is not prime
            return false;
        for (int i = 2; i <= (n/2); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPositive(String x)
    {
        try {
            return (Integer.parseInt(x) > 0);
        } catch(Exception e) {
            return false;
        }
    }

    public static boolean isInt(String x) throws NumberFormatException
    {
        try {
            Integer.parseInt(x);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        String s;

        //input
        do {
            System.out.println("Enter any positive int number: ");
            s = in.next();
        } while (!isInt(s) || !isPositive(s));
        if (isInt(s)) {
            n = Integer.parseInt(s);
        }

        //check
        if (isPrime(n))
            System.out.println(n + " is prime number");
        else System.out.println(n + " is not prime number");

    }

}
