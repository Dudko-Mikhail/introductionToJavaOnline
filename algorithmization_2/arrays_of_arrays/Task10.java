package arrays_of_arrays;

import java.util.Scanner;

/*
    10. Найти положительные элементы главной диагонали квадратной матрицы
*/

public class Task10 {
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
        System.out.println("Положительные элементы главной диагонали матрицы");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
