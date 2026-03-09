import java.util.ArrayList;
import java.util.Scanner;

public class Day5_4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String name = "";
        int score = 0;
        int maxidx = 0;



        while (true) {
            System.out.print("이름 (q 입력시 종료): ");
            name = sc.nextLine();

            if (name.equals("q")) break;

            names.add(name);

            System.out.print("점수: ");
            score = sc.nextInt();
            scores.add(score);

            sc.nextLine();
        }

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > scores.get(maxidx)) maxidx = i;
        }

        System.out.printf("최고점 학생: %s (%d점)", names.get(maxidx), scores.get(maxidx));
















    }
}
