import java.util.Scanner;

public class MultiplicityMainClass {

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
        int a;
        String s;
        Scanner in=new Scanner(System.in);

        try {
            do {
                System.out.println("Please enter number (int value, > 0): ");
                s = in.next();
            } while (!isInt(s) || !isPositive(s));

            if (isInt(s) && isPositive(s)) {
                a = Integer.parseInt(s);
                System.out.print("The number  " + a + " dividers are ");
                for (int i = a; i > 0; i--) {
                    int b = a % i;
                    if (b == 0)
                        System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.err.println("Incorrect data.");
        }

    }

}
