package Lines;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] mas = read.nextLine().split(" ");
        for (String x : mas){
            Pattern p = Pattern.compile("[ +]");
            Matcher m = p.matcher(x);
            if (!m.matches()){
                String t = x.trim();
                int n = t.length();
                if (n % 2 == 1){
                    System.out.println(t.substring(0, n / 2) + t.substring(n / 2 + 1));
                }
            }
        }
    }
}