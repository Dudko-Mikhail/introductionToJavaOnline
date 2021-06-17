package sorting;

import java.util.Scanner;

/*
    3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
    Требуется переставить элементы так, чтобы они были расположены по убыванию.
    Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего.
    Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("n: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "] = ");
            array[i] = in.nextInt();
        }
        in.close();

        int currentMax;
        int maxIndex;
        for (int i = 0; i < array.length; i++) {
            currentMax = array[i];
            maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > currentMax) {
                    currentMax = array[j];
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = currentMax;
            array[maxIndex] = temp;            
        }

        System.out.println("Отсортированный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
