import java.util.Scanner;

/*
    1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
*/

class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        System.out.println("z = " + ((a - 3) * b / 2 + c));
        in.close();
    }
}