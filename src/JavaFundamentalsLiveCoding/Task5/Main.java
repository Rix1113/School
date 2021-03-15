package JavaFundamentalsLiveCoding.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userNumber = scanner.nextInt();

        /* Loop every number, stop when reach user input */
        for (int i = 1; i < userNumber; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
            }
        }
    }

    /* Check is it prime number */
        public static boolean isPrime ( int n){
            if (n == 1) {
                return false;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

