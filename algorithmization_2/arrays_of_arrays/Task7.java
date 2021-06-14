package arrays_of_arrays;

import java.util.Scanner;

/*
    7. Сформировать квадратную матрицу порядка N по правилу: A[i][j] = sin((i * i - j * j) / N) 
и подсчитать количество положительных элементов в ней.
*/

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();

        double[][] matrix = new double[n][n];
        int positiveCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.sin((i * i + j * j) / (double) n);
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > 0) {
                    positiveCounter++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов матрицы: " + positiveCounter);
    }
}
