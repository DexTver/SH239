package Matrix;

public class F {
    public static void main(String[] args) {
        int arr[][]={
                {-5, 0, 14, 3},
                {13, 2, 19, 7},
                {0, 8, 0, 134},
                {4, 8, 12, 16}
        };
        int count = 0;
        for (int[] mas : arr){
            for (int x : mas){
                if (x != 0) count++;
            }
        }
        System.out.println(count);
    }
}