package arrays_of_arrays;

import java.util.Scanner;

/*
    2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int [][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] = ");
                matrix[i][j] = in.nextInt();
            }
            System.out.println();
        }
        in.close();

        System.out.println("Элементы, стоящие на диагонали матрицы");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                    break;
                }
            }
        }
    }
}
