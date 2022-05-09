import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int k = input.nextInt();

        for (int i = 1; i < k; i++) {
            if (k % i == 0) {
                toplam += i;
            }
        }
        if (toplam == k) {
            System.out.println("Number is perfect.");
        } else
            System.out.println("Number is not perfect.");
    }
}
