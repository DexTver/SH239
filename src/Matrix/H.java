package Matrix;

public class H {
    public static void main(String[] args) {
        int arr[][]={
                {0, 1, 1, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 1},
                {1, 1, 0, 1}
        };
        int n = 0, nulles, ones, maxn, maxo;
        for (int[] mas : arr) n++;
        for (int i = 0; i < n; ++i){
            maxn = maxo = -10000;
            nulles = ones = 0;
            if (arr[0][i] == 0) nulles++;
            else ones++;
            for (int j = 1; j < n; ++j){
                if (arr[j][i] != arr[j - 1][i]){
                    nulles = ones = 0;
                }
                if (arr[j][i] == 0) nulles++;
                else ones++;
                maxn = Math.max(maxn, nulles);
                maxo = Math.max(maxo, ones);
            }
            if (maxo > maxn) System.out.print((i + 1) + " ");
        }

    }
}