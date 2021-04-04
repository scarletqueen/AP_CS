import java.util.*;


public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int K = console.nextInt();
        int Q = console.nextInt();

        for (int i = 0; i < N; i++) {
            map.put(console.next(), console.nextInt());
        }

        for (int i = 0; i < K; i++) {
            String key = console.next();
            map.replace(key, map.get(key) + console.nextInt());
        }

        int total = 0;
        for (int i = 0; i < Q; i++) {
            total += map.get(console.next());
        }
        System.out.println(total);
    }
}
