package Methods;

public class B {
    public static void main(String[] args) {
        myMethod();
    }

    static void myMethod() {
        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println("");
        }
    }
}