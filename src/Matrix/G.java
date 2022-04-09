package Matrix;

public class G {
    public static void main(String[] args) {
        int arr[][] = {
                {-5, 0, 14, 3},
                {13, 2, 19, 7},
                {0, 8, 0, 134}
        };
        int max_n = -10000, min_n;
        for (int[] mas : arr){
            min_n = mas[0];
            for (int x : mas){
                min_n = Math.min(min_n, x);
            }
            max_n = Math.max(min_n, max_n);
        }
        System.out.println(max_n);
    }
}