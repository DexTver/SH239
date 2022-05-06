package IndividualWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), ans = 0;
        String regStr = "[0-9]+";
        Pattern p = Pattern.compile(regStr);
        read.nextLine();
        for (int i = 0; i < n; ++i){
            String x = read.nextLine();
            Matcher m = p.matcher(x);
            if (m.matches()) ans++;
        }
        System.out.println(ans);
    }
}