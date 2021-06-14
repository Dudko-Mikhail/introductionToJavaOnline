package arrays_of_arrays;

import java.util.Scanner;

/*
    3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

public class Task3 {
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
        System.out.print("Введите k[1-" + rows + "]: ");
        int k = in.nextInt();
        if (k > rows || k <= 0) {
            System.out.println("Некорректные данные (число k)");
            return;
        }
        System.out.print("Введите p[1-" + columns + "]: ");
        int p = in.nextInt();
        if (p > columns || p <= 0) {
            System.out.println("Некорректные данные (число p)");
            return;
        }
        in.close();

        System.out.println(k + "-я строка");        // Строка с нулевым индексом - первая строка
        for (int i = 0; i < matrix[k].length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }
        System.out.println("\n" + p + "-ый столбец");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][p - 1] + " ");
        }
    }
}
