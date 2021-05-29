import java.util.Scanner;

/*
    6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае
*/

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x = ");
        double x = in.nextDouble();
        System.out.print("y = ");
        double y = in.nextDouble();

        boolean square = Math.abs(x) <= 2 && Math.abs(y) <= 2;
        boolean rectangle = Math.abs(x) <= 4 && (y <= 0 && y >= -3);
        boolean ellipse = (2 * x) * (2 * x) + (y + 1) * (y + 1) < 0.5;
        System.out.println("answer: " + (!ellipse && (square || rectangle)));
        in.close();
    }
}
