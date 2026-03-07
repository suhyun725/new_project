import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int stu = sc.nextInt();
        int sum = 0;
        int max = 0;
        int min = 100;

        for (int i = 1; i<=stu; i++) {
            System.out.printf("%d번 학생 점수: ", i);
            int score = sc.nextInt();
            sum += score;

            if (score>max) max = score;
            if (score<min) min = score;

            String grade = "";
            if (score >= 90) grade ="A";
            else if (score >= 80) grade ="B";
            else if (score >= 70) grade ="C";
            else if (score >= 60) grade ="D";
            else grade ="F";

            System.out.printf("%d번 학생 학점: %s%n", i, grade);



        }
        System.out.println("--- 결과 ---");
        System.out.printf("총합: %d%n", sum);
        System.out.printf("총합: %.2f%n", (double)sum/stu);
        System.out.printf("최고점: %d%n", max);
        System.out.printf("최소점: %d%n", min);



    }
}
