public class ArrayAlgLib {

    //Array creation
    static void createRandArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (-21 + (20 + 20 + 1) * Math.random());
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    //Returns sum of all array elements
    static double getArraySum(int[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

    //Returns smm of all array rows
    static int getArraySumRows(int[][] arr, int i) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }

    //Returns sum of all array columns
    static int getArraySumColumns(int[][] arr, int j) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }


    //Returns of avg of all array elements
    static double getArrayAvg(int[][] arr) {
        double avg = (getArraySum(arr)) / 100;
        return avg;
    }

    //Returns min array element
    static int getArrayMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }

    //Returns max array element
    static int getArrayMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    //Returns array positive elements count
    static int getArrPosCount(int[][] arr) {
        int posCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 0)
                    posCount = posCount + 1;
            }
        }
        return posCount;
    }

}
