package IndividualWork;

public class F {
    public static void main(String[] args) {
//        int arr [] ={1, 2 ,1 ,1, 4, 1};
        int arr[] = {1 ,2, 1, 2, 2, 1};
        int a = arr[0], b = arr[0], x, ans = -1;
        for (int i = 1; i < arr.length; ++i) {
            x = arr[i];
            if (x != a) {
                if (a == b) {
                    b = x;
                } else if (x != b) {
                    ans = i + 1;
                    break;
                }
            }
        }
        System.out.println(ans != -1 ? ans : "NO");
    }
}