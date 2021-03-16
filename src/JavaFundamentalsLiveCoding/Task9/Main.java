package JavaFundamentalsLiveCoding.Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Wave heigth */
        int wave_heigth = 4;

        /* Scanner input wave length */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter wave length: ");
        int wave_length = scanner.nextInt();

        pattern(wave_heigth, wave_length);
    }

    static void pattern(int wave_heigth,
                        int wave_length)
    {
        int i, j, k, e, n, count, x;
        e = 2;
        x = 1;

        /* Wave height */
        for (i = 0; i < wave_heigth; i++)
        {
            for (j = wave_heigth; j <= wave_heigth + i; j++)
                System.out.print(" ");

            /* Wave length */
            for (count = 1; count <= wave_length; count++)
            {
               /* Spaces */
                for (n = (wave_heigth + wave_heigth - 2); n >= x; n--)
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
