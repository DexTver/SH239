package Structures;

import java.util.Scanner;
import java.util.Stack;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> a = new Stack<String>();
        String s = scanner.next();
        while (!s.equals("#")) {
            if (s.equals("-")) {
                System.out.println(a.pop());
            } else {
                a.push(s);
            }
            s = scanner.next();
        }
    }
}
