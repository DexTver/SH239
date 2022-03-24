package Lines;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String regStr = "[0-9]+";
        String[] str = read.nextLine().split(" ");
        Pattern p = Pattern.compile(regStr);
        for(String x : str){
            Matcher m = p.matcher(x);
            if (m.find()) System.out.println(x.trim());
        }
    }
}