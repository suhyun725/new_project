import java.util.Scanner;
import java.util.HashMap;

public class Day6_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> stus = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String name = "";
        String max_name = "";
        String min_name = "";
        int score = 0;
        int total = 0;
        double avg = 0;
        int max = 0;
        int min = 100;

        while (true) {
            System.out.print("이름 (0 입력시 종료): ");
            name = sc.nextLine();

            if (name.equals("0")) break;

            System.out.print("점수: ");
            score = sc.nextInt();

            total += score;

            stus.put(name, score);

            if (score > max) {
                max = score;
                max_name = name;
            }

            if (score < min) {
                min = score;
                min_name = name;
            }

            sc.nextLine();
        }

        avg = (double)total/stus.size();

        System.out.println("--- 결과 ---");

        System.out.printf("총합: %d%n", total);
        System.out.printf("평균: %.2f%n", avg);
        System.out.printf("최고점: %s (%d점)%n", max_name, stus.get(max_name));
        System.out.printf("최소점: %s (%d점)", min_name, stus.get(min_name));
    }
}
