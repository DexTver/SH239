package Massive;

public class I {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; // not copy!
        int c;
        for (int i = 0; i < arr.length - 1; i += 2){
            c = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = c;
        }
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}