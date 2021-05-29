import java.util.Scanner;

/*
    3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("x1 = ");
        double x1 = in.nextDouble();
        System.out.print("y1 = ");
        double y1 = in.nextDouble();
        
        System.out.print("x2 = ");
        double x2 = in.nextDouble();
        System.out.print("y2 = ");
        double y2 = in.nextDouble();

        System.out.print("x3 = ");
        double x3 = in.nextDouble();
        System.out.print("y3 = ");
        double y3 = in.nextDouble();
        in.close();

        if ((x3 - x2) * (y1 - y2) - (y3 - y2) * (x1 - x2) == 0) {
            System.out.println("3 точки лежат на одной прямой");
        }
        else {
            System.out.println("3 точки не лежат на одной прямой");
        }
        
    }    
}
