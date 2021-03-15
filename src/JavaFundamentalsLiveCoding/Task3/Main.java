package JavaFundamentalsLiveCoding.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x1, x2;

        /* Delta calculation */
        double delta = b * b - 4 * a * c;

        /* X1 and X2 calculation */
        if (delta > 0) {

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.format("root1 = " + x1 + "\nroot2 = " + x2);
        }

        /* If Delta == 0 */
        else if (delta == 0) {

            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
            System.out.format("x1 = " + x1);
            System.out.println("\nx2 = " + x2);

            /* If Delta is negative */
        }else {
            System.out.println("Delta negative");
        }
    }
}



