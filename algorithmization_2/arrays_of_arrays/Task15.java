package arrays_of_arrays;

import java.util.Scanner;

/*
    15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class Task15 {
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
        in.close();

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Максимальныей элемент матрицы: " + max);
        System.out.println("Итоговая матрица");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) % 2 == 1) {
                    matrix[i][j] = max;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
