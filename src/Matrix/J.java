package Matrix;

public class J {
    public static void main(String[] args) {
        int arr[][] ={

                {-5, 12, 12, -5},
                {13,  4,  4, 13},
                {0,  8,  8,  0}
        };
        int n;
        boolean fl = true;
        for (int[] mas : arr){
            n = 0;
            for (int x : mas) n++;
            for (int i = 0; i < ((n + 1) / 2); ++i){
                if (mas[i] != mas[n - i - 1]) fl = false;
            }
        }
        System.out.println(fl ? "YES" : "NO");
    }
}