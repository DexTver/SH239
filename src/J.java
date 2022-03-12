import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), x = read.nextInt();
        String ans = "true";
        for(int i = 1; i < n; ++i){
            ans = (x == read.nextInt()) ? ans : "false";
        }
        System.out.println(ans);
    }
}