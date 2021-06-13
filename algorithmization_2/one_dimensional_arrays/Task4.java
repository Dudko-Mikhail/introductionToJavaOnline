package one_dimensional_arrays;

import java.util.Scanner;

/*
    4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
*/

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }
        in.close();

        double min = array[0];
        double max = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        array[minIndex] = max;
        array[maxIndex] = min;

        System.out.println("Final array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
