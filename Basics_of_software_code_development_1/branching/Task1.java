import java.util.Scanner;

/*
    1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    он прямоугольным.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите первый угол: ");
        double a = in.nextDouble();
        System.out.print("Введите второй угол: ");
        double b = in.nextDouble();
        in.close();

        if (a + b >= 180) {
            System.out.println("Такого треугольника не существует");
        }
        else if (a == 90 || b == 90 || (a == 45 && b == 45)) {
            System.out.println("Треугольник является прямоугольным");
        }
        else {
            System.out.println("Треугольник не является прямоугольным");
        }
    }
}