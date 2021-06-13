package branching;

import java.util.Scanner;

/*
    4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    Определить, пройдет ли кирпич черезотверстие.
*/

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("A = ");
        double A = in.nextInt();
        System.out.print("B = ");
        double B = in.nextInt();
        System.out.print("x = ");
        double x = in.nextInt();
        System.out.print("y = ");
        double y = in.nextInt();
        System.out.print("z = ");
        double z = in.nextInt();
        in.close();

        double minXYZ = x;
        double maxXYZ = y;

        if (x > y) {
            minXYZ = y;
        } else {
            maxXYZ = y;
        }
        if (z < minXYZ) {
            minXYZ = z;
        }
        if (z > maxXYZ) {
            maxXYZ = z;
        }
        double averageXYZ = x + y + z - maxXYZ - minXYZ;
        boolean answer;
        answer = A > B ? (minXYZ < B && averageXYZ < A) : (minXYZ < A && averageXYZ < B);
        if (answer) {
            System.out.println("Кирпич пройдёт через отверстие");
        }
        else {
            System.out.println("Кирпич не пройдёт через отверстие");
        }

    }
}
