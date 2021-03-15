package JavaFundamentalsLiveCoding.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Insert circle diameter: ");
        Scanner input = new Scanner(System.in);
        float diameter = input.nextFloat();

        float perimeter = (float) (2 *  Math.PI * diameter);

        System.out.println(perimeter);

    }
}
