import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            int res = 0;
            int n = s.length();
            Map<Integer, Integer> map = new HashMap<>();
            int mask = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'b' || c == 'c' || c == 'x' || c == 'y' || c == 'z') {
                    mask = mask ^ (1 << (c - 'a'));
                }
                if (mask == 0) res = Math.max(res, i + 1);
                else if (map.containsKey(mask)) res = Math.max(res, i - map.get(mask));
                else map.put(mask, i);
            }
            System.out.println(res);
        }
    }

}
