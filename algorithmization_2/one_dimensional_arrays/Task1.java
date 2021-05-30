import java.util.Scanner;

/*
    1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N = ");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Incorrect input");
            System.exit(1);
        }
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        System.out.print("K = ");
        int k = in.nextInt();
        in.close();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
