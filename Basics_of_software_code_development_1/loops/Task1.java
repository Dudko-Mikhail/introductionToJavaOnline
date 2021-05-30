import java.util.Scanner;

/*
    1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    все числа от 1 до введенного пользователем числа.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        if (in.hasNextInt()) {
            int n = in.nextInt();
            in.close();
            if (n <= 0) {
                System.out.println("Введённое число не является положительным");
                System.exit(1);
            }
            else {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
            }
        }
        else {
            System.out.println("Некорректные входные данные");
            System.exit(1);
        }
    }
}
