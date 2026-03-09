import java.util.Scanner;

public class Day3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단수를 입력하세요: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", num, i, (num*i));

        }
    }
}
