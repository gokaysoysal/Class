import java.util.Scanner;

public class AmicableNumber {
    public static void main(String[] args) {
        int total1 = 0;
        int total2 = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        for (int i = 1; i < first; i++) {
            if (first % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < second; i++) {
            if (second % i == 0) {
                total2 += i;
            }
        }
        if (first == total2 & second == total1) {
            System.out.println("Numbers are amicable.");
        } else
            System.out.println("Numbers are not amicable.");
    }
}
