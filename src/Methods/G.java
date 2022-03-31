package Methods;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(myMethod(read.nextInt()));
    }

    static int myMethod(int a){
        return a - a % 10;
    }
}