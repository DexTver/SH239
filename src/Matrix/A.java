package Matrix;

public class A {
    public static void main(String[] args) {
        int arr[][] = {
                {6, 7, 2},
                {4, 9, 3, 7, 5, -2},
                {0, 6, 7, 4},
                {4, 7, 6, 3},
        };
        int count = 0;
        for (int[] mas : arr){
            for (int x : mas){
                if (x % 2 == 0 && x > 0) count++;
            }
        }
        System.out.println(count);
    }
}