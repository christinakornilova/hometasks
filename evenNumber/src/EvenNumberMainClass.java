/*
5. Ввести число, определить четное или нет.
 */

import java.util.Scanner;

public class EvenNumberMainClass {

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
            System.out.println("Enter any int number: ");
            s = in.next();
        } while (!isInt(s));
        if (isInt(s)) {
            n = Integer.parseInt(s);
        }

        //check
        if(n%2==0)
            System.out.print("Number " + n + " is even");
        else
            System.out.print("Number " + n + " is not even");
    }
}
