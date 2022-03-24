package Lines;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] mas = read.nextLine().split(" ");
        String end = read.nextLine().trim();
        for (String x: mas){
            if (x.endsWith(end)) System.out.println(x);
        }
    }
}