import java.util.Scanner;

public class CalcMain {

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

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            //user input
            String s1, operation;

            do {
                System.out.println("Input first operand (only decimal):");
                s1 = in.next();
            } while (!isInt(s1));
            int op1 = Integer.parseInt(s1);

            do {
                System.out.println("Input second operand (only decimal):");
                s1 = in.next();
            } while (!isInt(s1));
            int op2 = Integer.parseInt(s1);


            System.out.println("Input operation (+, -, *, /, %):");
            operation = in.next();

            //calculations
            if (operation != null && (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("%"))) {
                if (op2 == 0 && operation.equals("/")) {
                    System.out.println("Division by zero!");
                } else if (op2 != 0 && operation.equals("/")) System.out.println("Result:" + Math.round((op1 / op2)* 10000 / 10000));
                if (operation.equals("+")) {
                    System.out.println("Result:" + Math.round((op1 + op2)* 10000 / 10000));
                }else if (operation.equals("-")) {
                    System.out.println("Result:" + Math.round((op1 - op2)* 10000 / 10000));
                } else if (operation.equals("*")) {
                    System.out.println("Result:" + Math.round((op1 * op2)* 10000 / 10000));
                } else if (op2 == 0 && operation.equals("%")) {
                    System.out.println("Division by zero!");
                } else if (op2 != 0 && operation.equals("%"))
                    System.out.println("Result:" + Math.round((op1 % op2)* 10000 / 10000));
            } else System.out.println("Invalid entered data. Try to enter decimal values and use +, -, *, /, % for operation.");

            //if (operation.equals(" ")) System.out.println("Invalid entered data. Try to enter decimal values and use +, -, *, /, % for operation.");

        } catch (Exception e) {
            System.err.println("Invalid entered data. Try to enter decimal values as operands and use +, -, *, /, % for operation.");
        }
        in.close();
    }



}
