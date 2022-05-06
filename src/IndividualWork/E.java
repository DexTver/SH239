package IndividualWork;

import java.util.Objects;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] mas = read.nextLine().split(" ");
        int ans = 0;
        for (String x : mas) {
            if (!Objects.equals(x, "") && !Objects.equals(x, ".")) ans++;
        }
        System.out.println(ans);
    }
}