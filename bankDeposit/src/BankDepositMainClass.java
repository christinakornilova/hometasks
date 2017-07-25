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
        BigDecimal i, dep, percentVal;
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
                System.out.println("Enter deposit terms in years: ");
                s = in.next();
            } while (!isInt(s));
            year = new Integer(s);

            for (int j = 0; year > 0; j++) {
                i = BigDecimal.valueOf(percent);
                /*d= c.multiply(b.add(BigInteger.value.of(2))); // d=c*(b+2)*/
                //x = x.setScale(2, BigDecimal.ROUND_HALF_UP)
                percentVal = (dep.multiply(i)).divide(BigDecimal.valueOf(100));
                //percentVal = percentVal.setScale(2, BigDecimal.ROUND_HALF_UP);
                dep = dep.add((dep.multiply(i)).divide(BigDecimal.valueOf(100)));
                j1=j+1;
                year = year-1;
                System.out.println("For the "+ j1 + " year you deposit value will be "+ dep.setScale(2, BigDecimal.ROUND_HALF_UP).toString()+ "UAH " + ", percents sum will be " + percentVal.setScale(2, BigDecimal.ROUND_HALF_UP).toString() + "UAH");
            }




        } catch (Exception e) {
            System.err.println("Incorrect entered data.");
        }
    }
}
