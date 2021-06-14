package arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
*/

public class Task12 {

    public static void printMatrix(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] ascSort(int[][] matr) {
        int temp;

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length - 1; j++) {
                for (int k = 0; k < matr[i].length - j - 1; k++) {
                    if (matr[i][k] > matr[i][k + 1]) {
                        temp = matr[i][k];
                        matr[i][k] = matr[i][k + 1];
                        matr[i][k + 1] = temp;
                    }
                }
            }
        }
        return matr;
    }

    public static int[][] descSort(int[][] matr) {
        int temp;

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length - 1; j++) {
                for (int k = 0; k < matr[i].length - j - 1; k++) {
                    if (matr[i][k] < matr[i][k + 1]) {
                        temp = matr[i][k];
                        matr[i][k] = matr[i][k + 1];
                        matr[i][k + 1] = temp;
                    }
                }
            }
        }
        return matr;
    }
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
        System.out.println("Строки матрицы, отсортированные по возрастанию значений элементов");
        printMatrix(ascSort(matrix));
        System.out.println("Строки матрицы, отсортированные по убыванию значений элементов");
        printMatrix(descSort(matrix));
    }
}
