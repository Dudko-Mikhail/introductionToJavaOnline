package sorting;

import java.util.Scanner;

/*
    1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    дополнительный массив
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите размер 1-го массива: ");
        int n = in.nextInt();
        int[] first = new int[n];
        for (int i = 0; i < first.length; i++) {
            System.out.print("[" + i + "] = ");
            first[i] = in.nextInt();
        }
        System.out.print("\nВведите размер 2-го массива: ");
        int m = in.nextInt();
        int[] second = new int[m];
        for (int i = 0; i < second.length; i++) {
            System.out.print("[" + i + "] = ");
            second[i] = in.nextInt();
        }
        System.out.print("Введите k: ");
        int k = in.nextInt();
        in.close();

        if (k < 0 || k > first.length) {
            System.out.println("Неверные входные данные (k)");
            return;
        }

        System.out.println("Итоговый массив");
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + " ");
            if (i == k - 1) {
                for (int j = 0; j < second.length; j++) {
                    System.out.print(second[j] + " ");
                }
            }
        }
    }
}
