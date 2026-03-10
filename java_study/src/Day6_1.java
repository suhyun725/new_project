import java.util.HashMap;

public class Day6_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("수현", 85);
        map.put("인욱", 92);
        map.put("찬호", 70);

        for (String key : map.keySet()) {
            System.out.printf("%s: %d점%n", key, map.get(key));
        }


    }
}
