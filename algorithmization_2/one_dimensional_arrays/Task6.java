package one_dimensional_arrays;

import java.util.Scanner;

/*
    6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    являются простыми числами.
*/

public class Task6 {

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N = ");
        int n = in.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }
        in.close();

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(i + 1)) {
                sum += array[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
