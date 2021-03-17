// Take positive int and calc FIBO number.


package JavaFundamentalsLiveCoding.Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which fibonacci number do you want: ");
        int input = scanner.nextInt();

        int count = 1;
        int a = 0, b = 1, sum;
        while (count <= input) {
            if (count == input) {
                System.out.println(input + " fibonacci number is " +a);
            }
            sum = a + b;
            a = b;
            b = sum;
            count++;
        }
    }
}
