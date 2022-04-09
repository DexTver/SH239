package Matrix;

public class I {
    public static void main(String[] args) {
        int arr[][] = {
                {-5, 12, 12, -5},
                {13, 4, 4, 13},
                {0, 8, 8, 0}
        };
        int sum;
        for (int[] mas : arr) {
            sum = 0;
            for (int x : mas) {
                if (x > 0) sum += x;
            }
            System.out.println(sum);
        }
    }
}