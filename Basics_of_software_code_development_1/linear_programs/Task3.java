package linear_programs;

import java.util.Scanner;

/*
    3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    (six(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)
*/

public class Task3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("x = ");
        double x = in.nextDouble();
        System.out.print("y = ");
        double y = in.nextDouble();

        System.out.println("answer: " + (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
        in.close();
    }
}
