package arrays_of_arrays;

import java.util.Scanner;

/*
    5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
*/

public class Task5 {
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (j < matrix.length - i) ? i + 1 : 0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
