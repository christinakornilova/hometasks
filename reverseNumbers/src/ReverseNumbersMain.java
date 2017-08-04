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

            if (val>0){
                System.out.print("Reversed value for " + val + " is: ");
                while ((val > 0)) {
                    reverseVal = val % 10;
                    System.out.print(reverseVal);
                    val/=10;
                }
            } else {
                System.out.println("Incorrect data. Entered value should be positive.");
            }
        } catch (Exception e) {
            System.out.println("Incorrect data. Only positive decimal values are accepted.");
        }
    }
}
