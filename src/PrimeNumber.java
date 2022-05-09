import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        int k = input.nextInt();

        if (k == 1) {
            System.out.println("Number is not prime.");
            return;
        }
        if (k == 2) {
            System.out.println("Number is prime.");
        }
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number is prime.");
        } else System.out.println("Number is not prime.");

    }
}
