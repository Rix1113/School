package JavaFundamentalsLiveCoding.Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Wave height */
        int wave_height = 4;

        /* Scanner input wave lenght */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter wave lenght: ");
        int wave_length = scanner.nextInt();

        pattern(wave_height, wave_length);
    }

    static void pattern(int wave_height,
                        int wave_length)
    {
        int i, j, k, e, n, count, x;
        e = 2;
        x = 1;

        /* Wave height */
        for (i = 0; i < wave_height; i++)
        {
            for (j = wave_height; j <= wave_height + i; j++)
                System.out.print(" ");

            /* Wave lenght */
            for (count = 1; count <= wave_length; count++)
            {
               /* Spaces */
                for (n = (wave_height + wave_height - 2); n >= x; n--)
                    System.out.print(" ");

                for (k = 1; k <= e; k++)
                {
                    if (k == 1)
                        System.out.print("*");
                    else if (k == e)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }

            x = x + 2;
            e = e + 2;

            System.out.println();
        }
    }
}
