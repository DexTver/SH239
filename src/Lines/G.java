package Lines;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String a = read.nextLine();
        int k = a.indexOf('.');
        System.out.println(a.substring(k + 1));
    }
}