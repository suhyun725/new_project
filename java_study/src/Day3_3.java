import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();
        int fac = 0;

        for (int i = 1; i <= num; i++) {
            fac += i;
        }

        System.out.printf("1부터 %d까지의 값은: %d", num, fac);
    }
}
