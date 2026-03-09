import java.util.ArrayList;
import java.util.Scanner;

public class Day5_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int stu = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < stu; i++) {
            System.out.printf("%d번 학생 이름: ", i+1);
            list.add(sc.nextLine());


        }

        System.out.println("--- 학생 명단 ---");

        for (int i = 0; i < stu; i++) {
            System.out.printf("%d번: %s%n", i+1, list.get(i));
        }

    }
}
