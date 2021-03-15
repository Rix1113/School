package JavaFundamentalsLiveCoding.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number if you want to see a miracle :D  ");
        int number = input.nextInt();
        int countNumber = 1;

        for (int i = 1; i <= number; i++) {
            if (countNumber % 3 == 0 && countNumber % 7 == 0) {
                System.out.println("Fizz buzz");
            } else if (countNumber % 3 == 0) {
                System.out.println("Fizz");
            } else if (countNumber % 7 == 0) {
                System.out.println("Buzz");
            }else
                System.out.println(countNumber);
            countNumber++;
        }
    }
}
