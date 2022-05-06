package IndividualWork;

public class J {
    public static void main(String[] args) {
        int arr[] = {123, 34, 12, 67, 74, 47};
        int ost[] = {0, 0, 0};
        for (int x : arr) ost[x % 3]++;
        int maxind = 2;
        for (int i = 1; i >= 0; --i) {
            if (ost[i] > ost[maxind]) {
                maxind = i;
            }
        }
        System.out.println(maxind);
    }
}