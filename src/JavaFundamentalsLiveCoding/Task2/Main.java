package JavaFundamentalsLiveCoding.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter kilograms: ");
        float kg = input.nextFloat();
        if (kg <= 0) {
            System.out.println("Invalid parameter");
        } else

            System.out.print("Enter the height in cm: ");
        int cm = input.nextInt();
        if (cm <= 0) {
            System.out.println("Invalid parameter");
        } else {

            /* BMI calculation */

            float m = (float) cm / 100;
            float m2 = m * m;

            float bmi = kg / m2;

            /* Is optimal */

            if (bmi < 18.5 || bmi > 24.9) {
                System.out.println("BMI not optimal");
            } else {
                System.out.println("BMI is optimal");


            }
        }

    }
}
