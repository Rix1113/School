package JavaFundamentalsLiveCoding.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userNumber = scanner.nextInt();

        double i, sum = 0.0;

        for (i = 1; i <= userNumber; i++) {
            sum = sum + 1 / i;
        }
        System.out.println("Hn is " + sum);
        }
}
