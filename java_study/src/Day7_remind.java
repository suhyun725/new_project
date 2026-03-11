import java.util.Scanner;
import java.util.HashMap;

public class Day7_remind {
    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String word = "";
        String max_word = "";
        int max = 0;


        while (true) {
            System.out.print("단어 입력 (0 입력시 종료): ");
            word = sc.nextLine();

            if (word.equals("0")) break;

            words.put(word, words.getOrDefault(word, 0)+1);

            if (words.get(word) > max) {
                max_word = word;
                max = words.get(word);
            }
        }


        if (words.isEmpty()) System.out.println("입력된 단어가 없습니다!");
        else System.out.printf("가장 많이 입력된 단어: %s (%d번)", max_word, words.get(max_word) );


    }
}
