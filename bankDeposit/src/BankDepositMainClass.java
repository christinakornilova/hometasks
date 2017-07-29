/*
3. Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых, которые выплачивает банк,
длительность вклада (лет).
Вывести накопленную сумму денег за каждый год и начисленные проценты.
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BankDepositMainClass {

    public static boolean isInt(String x) throws NumberFormatException {
        try {
            Integer.parseInt(x);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isDouble(String x) throws NumberFormatException {
        try {
            Double.parseDouble(x);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String s;
        BigDecimal i, dep, percentVal, percentValTotal = new BigDecimal("0");
        int year, j1;
        double percent;

        try {
            do {
                System.out.println("Enter deposit value in UAH");
                s = in.next();
            } while (!isInt(s) && !isDouble(s));
            dep = new BigDecimal(s);

            do {
                System.out.println("Enter % per year: ");
                s = in.next();
            } while (!isInt(s) && !isDouble(s));
            percent = new Double(s);

            do {
                System.out.println("Enter deposit term in years: ");
                s = in.next();
            } while (!isInt(s));
            year = new Integer(s);

            for (int j = 0; year > 0; j++) {
                i = BigDecimal.valueOf(percent);
                percentVal = (dep.multiply(i)).divide(BigDecimal.valueOf(100));
                percentValTotal = percentValTotal.add(percentVal);
                dep = dep.add((dep.multiply(i)).divide(BigDecimal.valueOf(100)));
                j1=j+1;
                year = year-1;
                System.out.println("For the "+ j1 + " year you deposit value will be "+ dep.setScale(2, BigDecimal.ROUND_HALF_UP).toString()
                        + " UAH" + ", percents value per year will be " + percentVal.setScale(2, BigDecimal.ROUND_HALF_UP).toString() + " UAH"
                + ", percents value total will be " + percentValTotal.setScale(2, BigDecimal.ROUND_HALF_UP) + " UAH.");
            }




        } catch (Exception e) {
            System.err.println("Incorrect entered data.");
        }
    }
}
