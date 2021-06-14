package arrays_of_arrays;

import java.util.Scanner;

/*
    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму.
*/

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows = ");
        int rows = in.nextInt();
        System.out.print("columns = ");
        int columns = in.nextInt();
        int [][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] = ");
                matrix[i][j] = in.nextInt();
            }
            System.out.println();
        }

        int maxSum = 0;
        int column = 0;
        int sum = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Сумма элементов в " + i + "-ом столбце: " + sum);
            if (sum > maxSum) {
                maxSum = sum;
                column = i;
            }
            sum = 0;
        }
        System.out.println("Индекс столбца, который содержит максимальныую сумму элементов: " + column);
    }
}
