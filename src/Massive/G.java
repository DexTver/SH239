package Massive;

public class G {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 7, 0}; // not copy!
        int n = 0, sum = 0;
        for (int x : arr) {
            if (x % 2 != 0) {
                n++;
                sum += x;
            }
        }
        switch (n){
            case 0:
                System.out.println("NO");
                break;
            default:
                System.out.printf("%.2f", (float) sum / n);
        }
    }
}