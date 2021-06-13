package linear_programs;

import java.util.Scanner;

/*
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("R = ");
        double R = in.nextDouble();

        int wholePart = (int)R;
        int decimalPart = (int)(R * 1000 % 1000);
        System.out.println("answer: " + decimalPart + "." + wholePart);
        in.close();
    }
}
