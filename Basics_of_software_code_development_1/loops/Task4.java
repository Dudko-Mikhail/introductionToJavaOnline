import java.math.BigInteger;

/*
    4. Составить программу нахождения произведения квадратов первых двухсот чисел.
*/
public class Task4 {
    public static void main(String[] args) {
        BigInteger product = new BigInteger("1");

        for (int i = 2; i <= 200; i++) {
            product = product.multiply(new BigInteger(Integer.toString(i * i)));
        }
        System.out.println("product: " + product);
    }
}
