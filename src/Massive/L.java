package Massive;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // not copy!
        Scanner read = new Scanner(System.in);
        int k = read.nextInt(), start_ind = 0, count, c, b, n = arr.length;
        count = k;
        c = arr[0];
        boolean[] num = new boolean[k];
        for (int i = 0; i < k; ++i) {
            num[i] = true;
        }
        while (count > 0) {
            for (int t = 0; t < k; ++t) {
                if (num[t]) {
                    start_ind = t;
                    num[t] = false;
                    count--;
                    break;
                }
            }
            for (int i = start_ind; i < n + k; i += k)
                if (i >= n) {
                    int x = i % n;
                    if (!num[x]) {
                        arr[x] = c;
                    } else {
                        start_ind = x;
                        i = start_ind;
                        b = arr[x];
                        arr[x] = c;
                        c = b;
                        num[x] = false;
                        count--;
                    }
                } else {
                    b = arr[i];
                    arr[i] = c;
                    c = b;
                }

        }
    }
}