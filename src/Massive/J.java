package Massive;

public class J {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // not copy!
        int c = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; --i){
            arr[i] = arr[i - 1];
        }
        arr[0] = c;
        for (int x : arr){
            System.out.print(x + " ");
        }
        // решение работает за O(n)
        // не существует более эффективного решения
    }
}