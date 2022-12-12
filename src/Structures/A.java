package Structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class A {

    public static void print(ArrayList<String> a) {
        String s = String.join("\n", a) + "\n";
        System.out.println(s);
    }

    public static void rprint(ArrayList<String> a) {
        ArrayList<String> b = new ArrayList<String>(a);
        Collections.reverse(b);
        print(b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        int n = scanner.nextInt();
        String s;
        for (int i = 0; i < n; ++i) {
            s = scanner.next();
            a.add(s);
        }
        print(a);

        int x = scanner.nextInt();
        s = scanner.next();
        a.add(x, s);
        print(a);

        rprint(a);

        int y = scanner.nextInt();
        s = scanner.next();
        a.set(y, s);
        print(a);

        s = scanner.next();
        System.out.println(a.contains(s) ? "YES" : "NO");
    }
}
