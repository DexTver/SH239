package Practice;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt(), y = read.nextInt();
        int delta = y - x;
        int arr[] = new int[6];
        for (int i = 0; i < 6; i ++){
            arr[i] = x;
            x += delta;
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}