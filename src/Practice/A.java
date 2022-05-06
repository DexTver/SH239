package Practice;

import java.util.Objects;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String a = read.nextLine();
        boolean ans = (Objects.equals(a, "y"));
        System.out.println(ans ? "TRUE" : "FALSE");
    }
}