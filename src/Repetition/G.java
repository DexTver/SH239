package Repetition;

import java.util.Scanner;
// работает и для отрицательных
public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), r = 0, l = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = read.nextInt();
            r = Math.max(a[i], r);
            l = Math.min(a[i], l);
        }
        l = Math.abs(l);
        int[] b = new int[l + r + 1];
        for (int x : a) {
            if (x < 0) b[l + r + 1 + x]++;
            else b[x]++;
        }
        int ind = 0, maxv = 1;
        for (int i = 0; i < l + r + 1; i++) {
            if (b[i] > maxv) {
                ind = i;
                maxv = b[i];
            } else if (b[i] == maxv) {
                int x = i > r ? i - (l + r + 1) : i;
                int y = ind > r ? ind - n : ind;
                for (int j = 0; j < n; j++) {
                    if (a[j] == x) {
                        ind = i;
                        break;
                    }
                    if (a[j] == y) break;
                }
            }
        }
        System.out.println(ind > r ? ind - (l + r + 1) : ind);
    }
}