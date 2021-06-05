import java.util.Scanner;

/*
    10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
*/

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        for (int i = 1; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println("Итоговый массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
