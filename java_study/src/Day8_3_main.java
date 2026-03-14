import java.util.ArrayList;
import java.util.Scanner;

public class Day8_3_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Day8_3_Student> students = new ArrayList<>();
        int max = 0;
        String max_name = "";

        while (true) {
            System.out.print("이름 (0 입력시 종료): ");
            String name = sc.nextLine();

            if (name.equals("0")) break;

            System.out.print("점수: ");
            int score = sc.nextInt();
            sc.nextLine();

            students.add(new Day8_3_Student(name, score));

            if (score > max) {
                max = score;
                max_name = name;
            }
        }

        if (students.isEmpty()) System.out.println("입력된 학생이 없습니다!");
        else {
            System.out.println("--- 학생 명단 ---");
            for (Day8_3_Student i : students) {
                i.print();
            }

            System.out.printf("최고점: %s (%d점)", max_name, max);
        }
    }
}
