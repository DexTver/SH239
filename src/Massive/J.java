package Massive;

public class J {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // not copy!
        int k = 1, c, b, n = arr.length;
        c = arr[0];
        for (int i = 1; i <= n; ++i) {
            b = arr[(i * k) % n];
            arr[(i * k) % n] = c;
            c = b;
        }
        for (int t : arr) {
            System.out.print(t + " ");
        }
    }
}