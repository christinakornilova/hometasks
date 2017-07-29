/*
4. Вывести на консоль графику (ширину и высоту задает пользователь) вида:
а. Обычный прямоугольник
б. Конверт
в. В шахматном порядке
 */

import java.util.Scanner;

public class GeometryMainClass {


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

    public static boolean inRectangle(int i, int j, int n, int m) {
        return i == 0 || i == n - 1 || j == 0 || j == m - 1;
    }

    public static void drawRectangle() {

        Scanner in = new Scanner(System.in);
        int width = 0,length =0;
        String sw,sl;

        //input
        do {
            System.out.println("Enter width of the rectangle (int value, > 0): ");
            sw = in.next();
        } while (!isInt(sw) || !isPositive(sw));
        if (isInt(sw)) {
            width = Integer.parseInt(sw);
        }

        do {
            System.out.println("Enter length of the rectangle (int value, > 0): ");
            sl = in.next();
        } while (!isInt(sl) || !isPositive(sl));
        if (isInt(sl)) {
            length = Integer.parseInt(sl);
        }

        //draw
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if(inRectangle(i, j, length, width)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawEnvelope() {

        Scanner in = new Scanner(System.in);
        String s;
        int n = 0;

        //input
        do {
            System.out.println("Enter envelope side length/width (int value, > 0): ");
            s = in.next();
        } while (!isInt(s) || !isPositive(s));
        if (isInt(s)) {
            n = Integer.parseInt(s);
        }

        //draw
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if (i==0 || j==0 || i==n-1 || j==n-1 || i==j || j==n-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }

    public static void drawChess(){

        Scanner in = new Scanner(System.in);
        int rows = 0,cols = 0;
        String sw,sl;

        //input
        do {
            System.out.println("Enter width of the 'chess desk' (int value, > 0): ");
            sw = in.next();
        } while (!isInt(sw) || !isPositive(sw));
        if (isInt(sw)) {
            rows = Integer.parseInt(sw);
        }

        do {
            System.out.println("Enter length of the 'chess desk' (int value, > 0): ");
            sl = in.next();
        } while (!isInt(sl) || !isPositive(sl));
        if (isInt(sl)) {
            cols = Integer.parseInt(sl);
        }

        //draw
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                if((i+j)%2!=0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = 0,length =0;
        String s = "";


        try{
            //user input
            do {
                System.out.println("Enter what do you want to draw. 1 - for rectangle, 2 - for envelope, 3 - for chess desk (int values, > 0): ");
                s = in.next();
            } while (!s.equals("1") && !s.equals("2") && !s.equals("3"));

            //what to draw
            //
            switch (s){
                case "1":
                    drawRectangle();
                    break;
                case "2":
                    drawEnvelope();
                    break;
                case "3":
                    drawChess();
                    break;
            }


        } catch(Exception e) {
            System.out.println("Incorrect data.");
        }

    }

}
