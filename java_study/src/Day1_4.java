import java.util.Scanner;

public class Day1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요:");
        int age = sc.nextInt();

        System.out.printf("현재 나이: %d살%n", age);
        System.out.printf("10년 후 나이: %d살", (age+10));
    }
}
