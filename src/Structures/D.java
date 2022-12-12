package Structures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class D {
    public static void print(LinkedList<Integer> a) {
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> a = new LinkedList<Integer>();

        int i = scanner.nextInt();
        while (i != 0) {
            a.addLast(i);
            i = scanner.nextInt();
        }
        print(a);

        i = scanner.nextInt();
        while (i != 0) {
            System.out.print(a.contains(i) ? 1 : 0);
            System.out.print(" ");
            i = scanner.nextInt();
        }
        System.out.print("\n");

        a.replaceAll(integer -> integer + 1);
        print(a);

        LinkedList<Integer> b = new LinkedList<Integer>(a);
        Collections.reverse(b);
        print(b);
    }
}
