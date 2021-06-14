package arrays_of_arrays;

import java.util.Scanner;

/*
    6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
*/

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
        if (n % 2 == 1) {
            System.out.println("n должно быть чётным");
            return;
        }

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length / 2; i++) {   // заполнение матрицы
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (j < i || j > matrix.length - i - 1) ? 0 : 1;
                matrix[matrix.length - i - 1][j] = (j < i || j > matrix.length - i - 1) ? 0 : 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {   // вывод
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
