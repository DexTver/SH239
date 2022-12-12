package Structures;

import java.util.Scanner;
import java.util.Stack;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> a = new Stack<Character>();
        char[] s = scanner.next().toCharArray();
        boolean fl = true;
        for (char x : s) {
            if (x == '[' || x == '(' || x == '{') {
                a.push(x);
            } else if (!a.empty()) {
                if ((x == ']' && a.peek() != '[') || (x == ')' && a.peek() != '(') || (x == '}' && a.peek() != '{')) {
                    fl = false;
                    break;
                }
                a.pop();
            } else {
                fl = false;
                break;
            }
        }
        System.out.println(fl && a.empty() ? "YES" : "NO");
    }
}
