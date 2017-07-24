import java.util.Scanner;

import java.math.BigDecimal;

import java.math.RoundingMode;

public class AvgMain {

    public static boolean isNumeric(String x)
    {
        return isInt(x);
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

    public static boolean isDouble(String x) throws NumberFormatException
    {
        try {
            Double.parseDouble(x);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    static double roundResult (double d, int precise) {

        double newDouble = new BigDecimal(d).setScale(precise, RoundingMode.UP).doubleValue();
        return newDouble;

    }

    public static void  main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s;
        double op1, op2, avg;
        try {
            do {
                System.out.println("Input first operand (only numeric values):");
                s = in.next();
            } while (!isInt(s) && !isDouble(s));
            op1 = Double.parseDouble(s);

            do {
                System.out.println("Input second operand (only numeric values):");
                s = in.next();
            } while (!isInt(s) && !isDouble(s));
            op2 = Double.parseDouble(s);
            avg = roundResult((op1 + op2)/2, 4);

            System.out.println("Average of " + op1 + " and " + op2 + " is " + avg);


        } catch (Exception e){
            System.err.println("Invalid entered data.");
        }

    }

}
