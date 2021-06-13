package one_dimensional_arrays;

import java.util.Scanner;

/*
    3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    положительных и нулевых элементов.
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N = ");
        int n = in.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }
        in.close();

        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroes++;
            }
            else if (array[i] < 0) {
                negative++;
            }
            else {
                positive++;
            }
        }
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("zeroes: " + zeroes);
    }
}
