import java.util.Scanner;
import java.util.ArrayList;

public class Day7_2 {
    public static String calc_grade(int a) {
        if (a >= 90) return "A";
        else if (a >= 80) return "B";
        else if (a >= 70) return "C";
        else if (a >= 60) return "D";
        else return "F";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();


        System.out.print("학생 수를 입력하세요: ");
        int stu_num = sc.nextInt();

        for (int i = 0; i < stu_num; i++) {
            System.out.printf("%d번 학생 점수: ", i+1);
            int score = sc.nextInt();

            grades.add(score);
        }

        for (int i = 0; i < stu_num; i++) {
            System.out.printf("%d번 학생: %s%n", i+1, calc_grade(grades.get(i)));
        }
    }


}
