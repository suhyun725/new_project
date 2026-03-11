import java.util.Scanner;

public class Day7_1 {
    public static void calc(int a, int b) {
        System.out.printf("%d + %d = %d%n", a, b, a+b);
        System.out.printf("%d - %d = %d%n", a, b, a-b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %.2f%n", a, b, (double)a/b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력: ");
        int a = sc.nextInt();
        System.out.print("첫번째 숫자 입력: ");
        int b = sc.nextInt();

        calc(a,b);
    }
}
