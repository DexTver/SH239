package Lines;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), count = 0;
        String pass = read.nextLine(), ans="";
        for (int i = 0; i < n; ++i) {
            String t = read.next();
            if (t.length() > 5) ans += t + " ";
        }
        System.out.println(ans.trim());
    }
}