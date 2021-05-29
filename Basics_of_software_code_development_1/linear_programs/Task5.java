import java.util.Scanner;

/*
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.
*/

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("T = ");
        int T = in.nextInt();
        
        int hours = T / 3600;
        int minutes = T % 3600 / 60;
        int seconds = T % 60;

        System.out.printf("answer: %02dч %02dмин %02dс", hours, minutes, seconds);
        in.close();
    }
}
