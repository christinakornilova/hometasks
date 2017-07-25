import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AvgMainClass {

    static double roundResult (double d) {

        double newDouble = new BigDecimal(d).setScale(4, RoundingMode.UP).doubleValue();
        return newDouble;

    }

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int count;
            double sum = 0;

            System.out.println("Enter values, only numbers accepted. To complete entering please type any letter and press Enter. ");
            for (count = 0; scan.hasNextDouble(); count++) {
                sum = sum + scan.nextDouble();
            }
            System.out.println("Result: " + roundResult(sum / count));
        } catch (Exception e) {System.err.println("Incorrect entered data.");
        }

    }
}
