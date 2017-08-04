/*
12. Определить является ли число палиндромом
    (123456 - нет)(123321 - да)
    (9239329 - да)
 */

import java.util.Scanner;
import java.util.Arrays;


public class PalindromeMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Enter number that you want to check:");
        s = in.next();

        char[] p1 = s.toCharArray();
        char[] p2 = reverseArray(p1);
        System.out.println("Direct number: "+Arrays.toString(p1));
        System.out.println("Reversed number: "+Arrays.toString(p2));

        if ((Arrays.toString(p1)).equals(Arrays.toString(p2))){
            System.out.println("Entered number is palindrome");
        } else {
            System.out.println("Entered number is not palindrome");
        }


    }

    static char[] reverseArray(char[] arr){
        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[(arr.length-1)-i] = arr[i];
        }
        return arr2;
    }

}
