package Methods;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        System.out.println(myMethod(a));
    }

    static int toDouble(int x){
        int cf = 1, ans = 0;
        while (x > 1){
            ans += x % 2 * cf;
            cf *= 10;
            x /= 2;
        }
        ans += cf;
        return ans;
    }

    static int myMethod(int x){
        int n = (int) Math.floor(Math.log(x) / Math.log(2)) + 1;
        //x = toDouble(x);
        int cf = 1, ans = 0;
        while (x > 1){
            ans += x % 2 * cf;
            cf *= 10;
            x /= 2;
        }
        ans += cf;
        x = ans;
        int half = 0;
        for (int i = 0; i < n / 2; ++i){
            half += x % 10 * (int) Math.pow(10, i);
            x /= 10;
        }
        ans = half * (int) Math.pow(10, n / 2) + x;
        //int t = fromDouble(ans);
        int st = 0, t = 0;
        while (ans > 0){
            t += ans % 10 * Math.pow(2, st);
            st++;
            ans /= 10;
        }
        return t;
    }

    static int fromDouble(int ans){
        int st = 0, t = 0;
        while (ans > 0){
            t += ans % 10 * Math.pow(2, st);
            st++;
            ans /= 10;
        }
        return t;
    }
}