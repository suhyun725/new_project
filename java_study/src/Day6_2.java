import java.util.Scanner;
import java.util.HashMap;

public class Day6_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> stus = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String stu_name = "";
        String search = "";
        int stu_score = 0;

        while (true) {
            System.out.print("이름 (0 입력시 종료): ");
            stu_name = sc.nextLine();

            if (stu_name.equals("0")) break;

            System.out.print("점수: ");
            stu_score = sc.nextInt();

            stus.put(stu_name, stu_score);
            sc.nextLine();
        }

        System.out.println("--- 학생 명단 ---");

        for (String key : stus.keySet()) {
            System.out.printf("%s: %d점%n", key, stus.get(key));
        }

        while(true) {
            System.out.print("검색할 이름 (0 입력시 종료): ");
            search = sc.nextLine();

            if (search.equals("0")) break;

            if (stus.containsKey(search)) {
                System.out.printf("%s: %d점%n", search, stus.get(search));
            }
            else System.out.printf("%s은(는) 명단에 없습니다!%n", search);

        }
    }
}
