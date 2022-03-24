package Lines;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String a = read.nextLine().trim();
        int k = a.length() / 2;
        System.out.println(a.substring(k));
    }
}