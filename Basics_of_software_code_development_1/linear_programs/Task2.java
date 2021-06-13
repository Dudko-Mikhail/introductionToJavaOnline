package linear_programs;

import java.util.Scanner;

/*
    2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    (𝑏 + sqrt(b^2 + 4*a*c))/2a - a^3*c+b^(-2)
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        System.out.println("answer: " + ((b + Math.sqrt(b * b +  4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)));
        in.close();
    }
}
