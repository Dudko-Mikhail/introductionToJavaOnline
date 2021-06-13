package loops;

import java.util.Scanner;

/*
    2. Вычислить значения функции на отрезке [а,b] c шагом h:
    y = x, x > 2
    y = -x, x <= 2
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("h = ");
        if (a > b) {
            System.out.println("Некорректный интервал");
            System.exit(1);
        }
        double h = in.nextDouble();
        in.close();
        
        for (double x = a; x <= b; x += h) {   
            if (x == 0) {
                System.out.println("y(0) = 0");
                continue;
            }
            System.out.println("y(" + x + ") = " + (x > 2 ? x : -x));
        }
    }
}
