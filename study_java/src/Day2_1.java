import java.util.Scanner;

public class Day2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("학점: A");
        }
        else if (grade >= 80) {
            System.out.println("학점: B");
        }
        else if (grade >= 70) {
            System.out.println("학점: C");
        }
        else if (grade >= 60) {
            System.out.println("학점: D");
        }
        else {
            System.out.println("학점: F");
        }
    }
}
