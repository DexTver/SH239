package Matrix;


public class D {
    public static void main(String[] args) {
        int arr [][]={
                {6, 7, 4, 2},
                {4, 5, -3},
                {5, 6, 7, 4},
                {1}
        };
        int max_sum = -10000, sum;
        int[] ans = null;
        for (int mas[]: arr){
            sum = 0;
            for (int x : mas){
                sum += x;
            }
            if (sum > max_sum) {
                ans = mas;
                max_sum = sum;
            }
        }
        for (int x: ans){
            System.out.print(x + " ");
        }
    }
}