package JavaFundamentalsLiveCoding.Task8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Scanner where I must use parseFloat */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = Float.parseFloat(scanner.nextLine());


        System.out.print("\nEnter operator: ");
        String operant = scanner.nextLine();

        System.out.print("\nEnter second number: ");
        float b = Float.parseFloat(scanner.nextLine());

        if (!isTrue(operant)) {
            System.out.println("Invalid operant symbol");
        } else if (isTrue(operant)) {
            System.out.println(calculation(a, operant, b));
        } else
            System.out.println("Cannot calculate");
        }




        /* Calculating */

    public static float calculation(float a, String operant, float b) {

        float sum = 0;

        if (isTrue(operant))
        switch(operant) {
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
                break;
            case "*":
                sum = a * b;
                break;
            case "/":
                sum = a / b;
                break;
        }
        return sum;


    }

    /* Is operant is true */
    public static boolean isTrue(String operant) {
        if ((operant.equals("+")) || (operant.equals("-")) || (operant.equals("*")) || (operant.equals("/"))) {
            return true;
        }
        return false;
    }

}





