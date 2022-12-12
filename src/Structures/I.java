package Structures;

import java.util.*;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> a = new HashMap<String, String>();
        int n = scanner.nextInt();
        String k, v;
        while (n > 0) {
            k = scanner.next();
            v = scanner.next();
            if (a.get(k) != null) {
                System.out.println(a.get(k));
                n++;
            }
            a.put(k, v);
            n--;
        }
        a.keySet().stream().sorted().forEach(x -> System.out.println(a.get(x)));
    }
}
