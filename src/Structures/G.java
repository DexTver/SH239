package Structures;

import java.util.Scanner;
import java.util.Stack;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> a = new Stack<Integer>();
        char[] s = scanner.next().toCharArray();
        for (char x : s) {
            if (x == '+') {
                a.push(a.pop() + a.pop());
            } else if (x == '-') {
                a.push(-a.pop() + a.pop());
            } else if (x == '*') {
                a.push(a.pop() * a.pop());
            } else if (x == '/') {
                int sc = a.pop(), fr = a.pop();
                a.push(fr / sc);
            } else {
                a.push(x - '0');
            }
        }
        System.out.println(a.pop());
    }
}
