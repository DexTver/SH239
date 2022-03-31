package Methods;

public class A {

    public static void main(String[] args) {
        System.out.println(myMethod());
    }

    static int myMethod() {
        int count = 0;
        for (int x = 10; x < 100; ++x) {
            int i = x / 10, j = x % 10;
            if (((i - j) * (i - j)) > i + j){
                System.out.print(x + " ");
                count++;
            }
        }
        return count;
    }
}