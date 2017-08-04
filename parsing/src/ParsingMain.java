/*
11. Парсинг и вывод данных в консоль. Пользователь вводит массу в граммах вывести массу в соответствующих единицах измерения. Число может быть дробным.
    Пример:
    Ввод 123456789 -> Вывод 123 tons 456 kilograms 789 grams
    Пример:
    Ввод 123456.789 -> Вывод 123 kilograms 456 grams 789 micrograms
         2a. Пользователь вводит число, нужно запросить единицы измерения и вывести данные о массе.
    Ввод 123456
    Ввод kg
    Вывод 123 tons 456 kilograms 0 grams
         2b. Пропуск не значащих чисел
    Ввод 123000456
    Ввод g
    Вывод 123 tons 456 grams

 */


import java.math.BigDecimal;
import java.util.Scanner;

public class ParsingMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight;
        BigDecimal m;
        String s;

        //TODO:2a. Пользователь вводит число, нужно запросить единицы измерения и вывести данные о массе.

        try {
            System.out.println("Enter weight in grams");
            m = in.nextBigDecimal();
            s = String.valueOf(m);

            BigDecimal tons = (m.divide(BigDecimal.valueOf(1000000))).setScale(0,BigDecimal.ROUND_DOWN);
            if (tons.compareTo(BigDecimal.ZERO) != 0)
                System.out.print(tons+"tons ");

            BigDecimal kg = m.divide((BigDecimal.valueOf(1000)).setScale(0,BigDecimal.ROUND_DOWN));
            kg = (kg.subtract(tons.multiply(BigDecimal.valueOf(1000)))).setScale(0,BigDecimal.ROUND_DOWN);
            if (kg.compareTo(BigDecimal.ZERO) != 0)
                System.out.print(" "+kg+"kilograms ");

            //BigDecimal g = tons.multiply(BigDecimal.valueOf(1000000)).add(kg.multiply(BigDecimal.valueOf(1000)));
            //BigDecimal g = (m.divide(BigDecimal.valueOf(1000000))).multiply(BigDecimal.valueOf(1000000)).add(tons.multiply(BigDecimal.valueOf(1000)));
            BigDecimal g = (kg.multiply(BigDecimal.valueOf(1000))).add(tons.multiply(BigDecimal.valueOf(1000000)));
            g = (m.subtract(g)).setScale(0,BigDecimal.ROUND_DOWN);
            if (g.compareTo(BigDecimal.ZERO) != 0)
                System.out.print(" "+g+"grams");

            long mcg = getMicrograms(s);
            if (mcg > 0)
                System.out.print(" "+mcg+"micrograms");

        } catch (Exception e) {
            System.out.println("Incorrect data. Only positive decimal values are accepted.");
        }
    }

    static long getMicrograms(String s){
        String[] res = s.split("[.]");

        long mcg = 0;
        if(res.length > 1){
            mcg = Long.valueOf(res[1]);
        }
        return mcg;
    }



}
