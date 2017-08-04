/*
10. Развернуть число (123456 -> 654321)
*/

import java.util.Scanner;

public class ReverseNumbersMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int reverseVal=0;
        try {
            System.out.println("Input number that you want to revert (only positive decimal value): ");
            int val = in.nextInt();
            int val2 = val;

            //using string
            if (val>0){
                System.out.print("Reversed value for " + val + " using String data type is: ");
                while ((val > 0)) {
                    reverseVal = val % 10;
                    System.out.print(reverseVal);
                    val/=10;
                }
            } else {
                System.out.println("Incorrect data. Entered value should be positive.");
            }
            System.out.println("");

            //using int
            int reverseVal2 = 0;
                while (val2 > 0) {
                    reverseVal2 = reverseVal2 * 10 + (val2 % 10);
                    val2 /= 10;
                }
            System.out.println("Reversed value using int data type is: " + reverseVal2);

        } catch (Exception e) {
            System.out.println("Incorrect data. Only positive decimal values are accepted.");
        }
    }
}
