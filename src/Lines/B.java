package Lines;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String regStr = "[0-9]+";
        Pattern p = Pattern.compile(regStr);
        int n = read.nextInt(), count = 0;
        String pass = read.nextLine();
        for (int i = 0; i < n; ++i){
            String t = read.nextLine();
            Matcher m = p.matcher(t);
            if (!m.find()) count++;
        }
        System.out.println(count);
    }
}