package loops;

import java.util.Scanner;

/*
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид: a(n) = 1/(2^n) + 1/(3^n)
*/

public class Task5 {

    public static double findMember(int n) {
        return 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Incorrect input");
            System.exit(1);
        }
        System.out.print("e = ");
        double e = in.nextDouble();
        in.close();

        double sum = 0;
        for (int i = 0; i <= n; i++) {
            double value = findMember(i);
            if (value >= e) {
                sum += value; 
            }
            else {
                break;
            }
        }
        System.out.println("sum: " + sum);
    }

}
