import java.util.Scanner;

/*
    7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
*/
public class Task7 {

    public static void printDivisors(int n) {
        int i = 2;
        while(n / 2 >= i) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("m = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
        if (m > n) {
            System.out.println("m > n");
        }
        else {
            for (int i = m; i < n; i++) {
                System.out.println("Non-trivial divisors of " + i);
                printDivisors(i);
            }
        }
        
    }
}
