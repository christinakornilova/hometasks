import java.util.Scanner;

public class CalculationsLib {
    private static Scanner in = new Scanner(System.in);
    private static String s;
    private static double weight;

    private static int getMega(double weight) {
        return (int) (weight / 1000000);

    }

    private static int getKilo(double weight) {
        return (int) ((weight / 1000) - getMega(weight) * 1000);
    }

    private static int getDeca(double weight) {
        return (int) weight % 1000;
    }

    private static long getMilli(String weight) {
        String[] parts = String.valueOf(weight).split("[.]");
        long milli = 0;
        if (parts.length > 1) {
            milli = Long.valueOf(parts[1]);
        }
        return milli;
    }

    static void caseGrams() {
        System.out.println("Enter weight in grams: ");
        s = in.nextLine();
        weight = Double.parseDouble(s);

        if (CalculationsLib.getMega(weight) != 0) {
            System.out.print(CalculationsLib.getMega(weight) + "tons ");
        }
        if (CalculationsLib.getKilo(weight) != 0) {
            System.out.print(CalculationsLib.getKilo(weight) + "kilograms ");
        }
        if (CalculationsLib.getDeca(weight) != 0) {
            System.out.print(CalculationsLib.getDeca(weight) + "grams ");
        }
        if (CalculationsLib.getMilli(s) != 0) {
            System.out.print(CalculationsLib.getMilli(s) + "micrograms");
        }

    }

    static void caseKilograms() {
        System.out.println("Enter weight in kilograms: ");
        s = in.nextLine();
        weight = Double.parseDouble(s);
        if (CalculationsLib.getMega(weight) != 0) {
            System.out.print(CalculationsLib.getMega(weight) + "kilotons ");
        }
        if (CalculationsLib.getKilo(weight) != 0) {
            System.out.print(CalculationsLib.getKilo(weight) + "tons ");
        }
        if (CalculationsLib.getDeca(weight) != 0) {
            System.out.print(CalculationsLib.getDeca(weight) + "kilograms ");
        }
        if (CalculationsLib.getMilli(s) != 0) {
            System.out.print(CalculationsLib.getMilli(s) + "grams");
        }
    }

    static void caseTons() {
        System.out.println("Enter weight in tons: ");
        s = in.nextLine();
        weight = Double.parseDouble(s);

        if (CalculationsLib.getMega(weight) != 0) {
            System.out.print(CalculationsLib.getMega(weight) + "megatons ");
        }

        if (CalculationsLib.getKilo(weight) != 0) {
            System.out.print(CalculationsLib.getKilo(weight) + "kilotons ");
        }
        if (CalculationsLib.getDeca(weight) != 0) {
            System.out.print(CalculationsLib.getDeca(weight) + "tons ");
        }

        if (CalculationsLib.getMilli(s) != 0) {
            System.out.print(CalculationsLib.getMilli(s) + "kilograms");
        }
    }
}
