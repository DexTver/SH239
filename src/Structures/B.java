package Structures;

import java.util.LinkedList;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> a = new LinkedList<String>();
        String s = scanner.next();
        while (!s.equals("#")) {
            a.addLast(s);
            s = scanner.next();
        }
        System.out.println(a);

        s = scanner.next();
        while (!s.equals("#")) {
            a.addFirst(s);
            s = scanner.next();
        }
        System.out.println(a);

        int i = 1;
        while (i != 0) {
            i = scanner.nextInt();
            s = scanner.next();
            a.add(i, s);
        }
        System.out.println(a);

        i = 1;
        while (i != 0) {
            i = scanner.nextInt();
            a.remove(i);
        }
        System.out.println(a);
    }
}
