import java.util.Scanner;

/*
    7. Даны действительные числа a1, a2, ..., a2n. Найти max(a1+a2n, a2+a(2n-1), ..., an+a(n+1)).
*/

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        double[] array = new double[2 * n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }
        in.close();

        double max = array[0] + array[array.length - 1];
        double currentValue;
        for (int i = 0; i < array.length / 2 + 1; i++) {
            currentValue = array[i] + array[array.length - i - 1];
            if (currentValue > max) {
                max = currentValue;
            }
        }
        System.out.println("max = " + max);
    }
}
