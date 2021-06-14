package arrays_of_arrays;

import java.util.Scanner;

/*
    8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры.
*/

public class Task8 {
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
        System.out.print("Введите номер первого столбца[1-" + columns + "]: ");
        int first = in.nextInt();
        if (first > columns || first <= 0) {
            System.out.println("first > columns");
            return;
        }
        System.out.print("Введите номер второго столбца[1-" + columns + "]: ");
        int second = in.nextInt();
        if (second > columns || second <= 0) {
            System.out.println("second > columns");
            return;
        }
        in.close();

        int temp;
        for (int i = 0; i < matrix.length; i++) {    // Столбец с нулевым индексом - первый столбец
            temp = matrix[i][first - 1];
            matrix[i][first - 1] = matrix[i][second - 1];
            matrix[i][second - 1] = temp;
        }
        System.out.println("Итоговая матрица");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
