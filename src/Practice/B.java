package Practice;

import java.util.Objects;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] mas = new String[255];
        boolean fl;
        int ans = 0, ind = 0;
        String[] a = read.nextLine().split(" ");
        for (String x : a){
            fl = true;
            for (String y : mas){
                fl = !Objects.equals(x, y) && fl && !Objects.equals(x, "");
            }
            if (fl) ans++;
            mas[ind] = x;
            ind++;
        }
        System.out.println(ans);
    }
}