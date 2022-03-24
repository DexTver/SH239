package Lines;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] mas = read.nextLine().split(" ");
        String x = read.nextLine();
        int count = 0;
        for (String a: mas){
            if (x.equals(a)) count++;
        }
        System.out.println(count);
    }
}