package Structures;

import java.util.LinkedList;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> a = new LinkedList<String>();
        String com = scanner.next(), s;
        int i;
        while (!com.equals("#")) {
            switch (com) {
                case "add":
                    i = scanner.nextInt();
                    s = scanner.next();
                    a.add(i, s);
                    break;
                case "remove":
                    i = scanner.nextInt();
                    a.remove(i);
                    break;
                case "clear":
                    a.clear();
                    break;
                case "get":
                    i = scanner.nextInt();
                    System.out.println(a.get(i));
                    break;
                case "set":
                    i = scanner.nextInt();
                    s = scanner.next();
                    a.set(i, s);
                    break;
                default:
                    break;
            }
            System.out.println(a);
            com = scanner.next();
        }
    }
}
