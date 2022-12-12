package Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> a = new HashMap<String, String>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            a.put(scanner.next(), scanner.next());
        }

        String s;
        int k = scanner.nextInt();
        for (int i = 0; i < k; ++i) {
            s = scanner.next();
            System.out.println(a.get(s));
            a.remove(s);
        }

        System.out.println(a.size());
        a.keySet().stream().sorted().forEach(System.out::println);
    }
}
