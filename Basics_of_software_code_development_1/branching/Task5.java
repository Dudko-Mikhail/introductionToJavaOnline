import java.util.Scanner;

/*
    5. Вычислить значение функции: F(x) = x^2-3x+9  | x <= 3
                                   F(x) = 1/(x^3+6) | x > 3
*/

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x = ");
        double x = in.nextDouble();
        in.close();

        double result = x <= 3 ? x * x - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
        System.out.println("result: " + result);
    }
}
