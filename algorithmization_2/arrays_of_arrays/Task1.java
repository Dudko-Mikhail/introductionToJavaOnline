package arrays_of_arrays;

import java.util.Scanner;

/*
    1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("rows = ");
        int rows = in.nextInt();
        System.out.print("columns = ");
        int columns = in.nextInt();
        int [][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] > matrix[rows - 1][i] && i % 2 == 0) {   // 0 столбец является нечётным, т.к. он первый
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
