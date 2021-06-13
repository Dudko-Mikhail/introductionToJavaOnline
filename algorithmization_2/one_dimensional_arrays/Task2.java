package one_dimensional_arrays;

import java.util.Scanner;

/*
    2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
    большие данного Z, этим числом. Подсчитать количество замен.
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("n = ");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Incorrect input");
            System.exit(1);
        }
        double[] sequence = new double[n];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = in.nextDouble();
        }
        System.out.print("Z = ");
        double z = in.nextDouble();
        in.close();

        int count = 0;
        System.out.println("Final sequence:");
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > z) {
                sequence[i] = z;
                count++;
            }
            System.out.print(sequence[i] + " ");
        }
        System.out.println("\nreplaceCounter = " + count);
    }
}
