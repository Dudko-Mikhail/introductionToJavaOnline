package arrays_of_arrays;

/*
    11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
*/

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Номера строк, в которых число 5 встречается три и более раз");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.print(i + " ");
            }
            counter = 0;
        }
    }
}
