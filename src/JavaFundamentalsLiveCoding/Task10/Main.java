package JavaFundamentalsLiveCoding.Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int countNumber = getLength(userInput);


        int a, b = 0;
        int finalResult = 0;
        int uI = userInput;

        for (int i = 0; i < countNumber; i++) {
            a = uI % 10;
            b = uI /10;
            uI = uI / 10;
            finalResult = finalResult + a;
        }
        System.out.println(finalResult);
    }

    private static int getLength(int num) {

        int count = 1;

        while (num >= 10) {
            num = num / 10;
            count++;
        }

        return count;
    }
}
