/*
9. Пользователь вводит координаты верхнего левого и нижнего правого угла прямоугольника, а также координаты точки (X,Y)
в прямоугольной системе координат. Реализовать функцию, которая определяет принадлежит ли точка этому прямоугольнику.
 */
import java.util.Scanner;

public class RectnglePointClass {

    public static boolean isDouble(String x) throws NumberFormatException {
        try {
            Double.parseDouble(x);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean inRectangle(double[] z, double[] x, double[] y){
        if ((z[0]>=x[0])&&(z[0]<=y[0])&&(z[1]>=y[1])&&(z[1]<=x[1])){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        double res;
        int j = 1;
        double[] x = {0, 0}, y = {0, 0}, z = {0, 0};


        try {
            do {
                System.out.println("Specify the rectangle.");
                System.out.println("Input rectangle's top left apex coordinate x");
                s1 = in.next();
                System.out.println("Input rectangle's top left apex coordinate y");
                s2 = in.next();
            } while (!isDouble(s1) || !isDouble(s2));


            if (isDouble(s1) && isDouble(s2)) {
                x[0] = Double.parseDouble(s1);
                y[0] = Double.parseDouble(s2);

            }

            do {
                System.out.println("Input rectangle's bottom right apex coordinate x");
                s1 = in.next();
                System.out.println("Input rectangle's bottom right apex coordinate y");
                s2 = in.next();
            } while (!isDouble(s1) || !isDouble(s2));
            if (isDouble(s1) && isDouble(s2)) {
                x[1] = Double.parseDouble(s1);
                y[1] = Double.parseDouble(s2);

            }

            do {
                System.out.println("Specify point that you want to check.");
                System.out.println("Input point's coordinate x");
                s1 = in.next();
                System.out.println("Input point's coordinate y");
                s2 = in.next();
            } while (!isDouble(s1) || !isDouble(s2));
            if (isDouble(s1) && isDouble(s2)) {
                z[0] = Double.parseDouble(s1);
                z[1] = Double.parseDouble(s2);
            }

            if (inRectangle(z, x, y)) {
                System.out.println("The point ("+z[0]+","+z[1]+") appertains to rectangle");
            } else {
                System.out.println("The point ("+z[0]+","+z[1]+") does not appertain to rectangle");
            }
    }catch (Exception e){
            System.out.println("Incorrect data.");
        }







    }
}
