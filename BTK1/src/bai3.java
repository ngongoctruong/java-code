import java.util.Random;

public class bai3 {
    public static void main(String[] args) {
        int counter;
        Random number = new Random();
        System.out.println("  ");


    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
