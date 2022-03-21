package Massive;

public class K {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // not copy!
        int k = arr.length / 2, c;
        for (int i = 0; i < k; ++i){
            c = arr[i];
            arr[i] = arr[i + k];
            arr[i + k] = c;
        }
    }
}