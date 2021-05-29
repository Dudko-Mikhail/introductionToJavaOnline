import java.util.Scanner;

/*
    2. Найти max{min(a, b), min(c, d)}.
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        double a  = in.nextDouble();
        System.out.print("b = ");
        double b  = in.nextDouble();
        System.out.print("c = ");
        double c  = in.nextDouble();
        System.out.print("d = ");
        double d  = in.nextDouble();
        in.close();

        double min1 = a;
        double min2 = c;
        if (a > b) {
            min1 = b;
        }
        if (c > d) {
            min2 = d;
        }
        System.out.println("max(min(a, b), min(c, d)): " +  (min1 > min2 ? min1 : min2));
    }
}
