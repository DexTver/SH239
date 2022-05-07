package IndividualWork;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), pow_of_two = 1;
        System.out.println(" Index | Degree");
        System.out.println("-------+--------");
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j < (4 - (Integer.toString(i)).length()); ++j)
                System.out.print(" ");
            System.out.print(i);
            System.out.print("   ");
            System.out.print("|");

            for (int j = 0; j < (7 - Integer.toString(pow_of_two).length()); ++j)
                System.out.print(" ");
            System.out.print(pow_of_two);
            System.out.print("\n");

            pow_of_two *= 2;
        }
    }
}