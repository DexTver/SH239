import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), x = 1;
        for(int i = 1; i <= n; ++i){
            System.out.print(x * i + " ");
            x *= -1;
        }
    }
}