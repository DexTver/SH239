package Methods;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(myMethod('1'));
    }

    static boolean myMethod(char x) {
        if ((97 <= x && x <= 122) || (65 <= x && x <= 90)) return true;
        return false;
    }
}