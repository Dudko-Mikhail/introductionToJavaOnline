package loops;

import java.util.Scanner;

/*
    8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
*/
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Первое число: ");
        long a = in.nextLong();
        System.out.print("Второе число: ");
        long b = in.nextLong();
        in.close();

        int[] digitsA = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] digitsB = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        int digit = 0;
        while (a > 0) {
            digit = (int)(a % 10);
            digitsA[digit] = digit; 
            a /= 10;
        }
        System.out.println();
        while (b > 0) {
            digit = (int)(b % 10);
            digitsB[digit] = digit; 
            b /= 10;
        }

        System.out.println("Цифры, которые есть в обоих числах: ");
        for (int i = 0; i < 10; i++) {
            if (digitsA[i] == digitsB[i] && digitsA[i] != 10) {
                System.out.print(digitsA[i] + " ");
            }
        }
    }
}
