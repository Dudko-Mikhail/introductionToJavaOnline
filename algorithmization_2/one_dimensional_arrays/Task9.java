import java.util.Scanner;

/*
    9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    чисел несколько, то определить наименьшее из них
*/

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < array.length - 1; i++) {  // сортировка массива
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int maxFrequency = 1;
        int currentFrequency = 1;
        int currentMinAnswer = array[0];
        int currentNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentNumber) {
                currentFrequency++;
            }
            else {
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    currentMinAnswer = currentNumber;
                }
                if (i + 1 != array.length) {
                    currentNumber = array[i + 1];
                }
                currentFrequency = 0;
            }
        }
        System.out.println("Наиболее часто встречающееся число в массиве: " + currentMinAnswer);
    }
}
