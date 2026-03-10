import java.util.Scanner;
import java.util.HashMap;

public class Day6_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String word = "";

        while (true) {
            System.out.print("단어 입력 (0 입력시 종료): ");
            word = sc.nextLine();

            if (word.equals("0")) break;

            words.put(word, words.getOrDefault(word, 0) +1);
        }

        System.out.println("--- 단어 카운트 ---");

        for (String key : words.keySet()) {
            System.out.printf("%s: %d번%n", key, words.get(key));
        }

    }
}
