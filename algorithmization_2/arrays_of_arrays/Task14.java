package arrays_of_arrays;

import java.util.Scanner;

/*
    14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.
*/

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("m = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();

        int[][] matrix = new int[m][n];
        int counter;
        for (int i = 0; i < n; i++) {
            counter = i + 1;
            while (counter != 0) {
                int row = (int) (Math.random() * m);
                if (matrix[row][i] == 0) {
                    matrix[row][i] = 1;
                    counter--;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }     
    }
}
