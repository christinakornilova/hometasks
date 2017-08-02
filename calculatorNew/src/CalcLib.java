//calculations

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcLib {

    static boolean isInt(String x) throws NumberFormatException
    {
        try {
            Integer.parseInt(x);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    static boolean isDouble(String x) throws NumberFormatException {
        try {
            Double.parseDouble(x);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static double roundResult (double d) {

        double newDouble = new BigDecimal(d).setScale(4, RoundingMode.HALF_UP).doubleValue();
        return newDouble;

    }

    static boolean divisionByZero(double a, double b){
        if (b == 0) {
            System.out.println("Division by zero!");
            return true;
        } else {
            return false;
        }
    }

    static double addValues(double a, double b){
        return  CalcLib.roundResult(a + b);
    }

    static double subValues (double a, double b){
        return CalcLib.roundResult(a - b);
    }

    static double mulValues(double a, double b){
        return CalcLib.roundResult(a * b);
    }

    static double divValues(double a, double b){
            return CalcLib.roundResult(a / b);
    }

    static double modValues(double a, double b){
           return CalcLib.roundResult(a % b);
    }


}
