package sorting;

import java.util.Scanner;

/*
    2. Даны две последовательности a1 < a2 < ... < an и b1 < b2 < ... < bm.
    Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
    Примечание. Дополнительный массив не использовать.
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("n: ");
        int n = in.nextInt();
        int[] first = new int[n];
        for (int i = 0; i < first.length; i++) {
            System.out.print("[" + i + "] = ");
            first[i] = in.nextInt();
        }
        System.out.print("\nm: ");
        int m = in.nextInt();
        int[] second = new int[m];
        for (int i = 0; i < second.length; i++) {
            System.out.print("[" + i + "] = ");
            second[i] = in.nextInt();
        }

        int firstIterator = 0;
        int secondIterator = 0;
        System.out.println("\nИтоговый массив");
        while (firstIterator + secondIterator < first.length + second.length) {
            if (firstIterator >= first.length) {
                System.out.print(second[secondIterator] + " ");
                secondIterator++;
                continue;
            }
            if (secondIterator >= second.length) {
                System.out.print(first[firstIterator] + " ");
                firstIterator++;
                continue;
            }
            if (first[firstIterator] < second[secondIterator]) {
                System.out.print(first[firstIterator] + " ");
                firstIterator++;
            }
            else {
                System.out.print(second[secondIterator] + " ");
                secondIterator++;
            }
        }
    }
}
