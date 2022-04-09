package Matrix;

public class C {
    public static void main(String[] args) {
        int arr [][]= {
                {6, 7, 4, 2},
                {4, 7, 5, -3},
                {0, 6, 7, 4},
                {4, 7, 7, 3}
        };
        int n = 0;
        for (int mas[] : arr){
            n++;
        }
        int max_mas[] = new int[n];
        for (int i = 0; i < n; ++i) max_mas[i] = -10000;
        for (int mas[]: arr){
            for (int i = 0; i < n; ++i){
                max_mas[i] = Math.max(max_mas[i], mas[i]);
            }
        }
        for (int x : max_mas){
            System.out.print(x + " ");
        }
    }
}