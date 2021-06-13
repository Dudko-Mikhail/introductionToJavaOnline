package one_dimensional_arrays;

import java.util.Scanner;

/*
    8. Дана последовательность целых чисел (a1, a2, ..., an).
    Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,...,an).
*/

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                counter++;
            }
        }
        int[] answer = new int[n - counter];
        System.out.println("Новая последовательность");
        for (int i = 0, j = 0; i < answer.length; i++) {
            if (array[i] != min) {
                answer[j] = array[i];
                System.out.print(answer[j] + " ");
                j++;
            }
        }
    }
}
