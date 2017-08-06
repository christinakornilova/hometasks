/*
Двумерный массив 10х10, заполнить случайными числами от -20 до 20. Реализовать функцию:
    определения суммы элементов массива,
    среднее арифметическое,
    минимальный элемент,
    максимальный элемент,
    число положительных элементов
    сумму по строкам.

 */

public class RandomArrayMain {

    public static void main(String[] args) {
        int[][] array = new int[10][10];

        ArrayAlgLib.createRandArray(array);
        System.out.println("Array sum is: " + String.format("%.0f", ArrayAlgLib.getArraySum(array)));
        System.out.println();
        System.out.println("Average of array elements is: " + String.format("%.2f", ArrayAlgLib.getArrayAvg(array)));
        System.out.println();
        System.out.println("Array minimum element is: " + ArrayAlgLib.getArrayMin(array));
        System.out.println();
        System.out.println("Array maximum element is: " + ArrayAlgLib.getArrayMax(array));
        System.out.println();
        System.out.println("Array positives count is: " + ArrayAlgLib.getArrPosCount(array));
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            System.out.println("Array column " + j + " sum is: " + ArrayAlgLib.getArraySumColumns(array, j));
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array row " + i + " sum is: " + ArrayAlgLib.getArraySumRows(array, i));
        }

    }


}
