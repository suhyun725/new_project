import java.util.Scanner;

public class Day4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int stu = sc.nextInt();
        int[] scores = new int[stu];
        String[] grades = new String[stu];
        int sum = 0;
        int max = 0;
        int min = 100;

        for (int i=0; i <stu; i++) {
            System.out.printf("%d번 학생 점수: ", i+1);
            scores[i] = sc.nextInt();

            sum += scores[i];

            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];

            if (scores[i] >= 90) {
                grades[i] = "A";
            }
            else if (scores[i] >= 80) {
                grades[i] = "B";
            }
            else if (scores[i] >= 70) {
                grades[i] = "C";
            }
            else if (scores[i] >= 60) {
                grades[i] = "D";
            }
            else grades[i] = "F";
        }

        System.out.println("--- 결과 ---");
        System.out.printf("총합: %d%n", sum);
        System.out.printf("평균: %.2f%n", (double)sum/stu);
        System.out.printf("최고점: %d%n", max);
        System.out.printf("최소점: %d%n%n", min);

        System.out.println("--- 학점 ---");
        for (int i=0; i <stu; i++) {
            System.out.printf("%d번 학생: %s%n", i+1, grades[i]);
        }

    }
}
