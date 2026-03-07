import java.util.Scanner;

public class Day2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("연산자(+,-,*,/)를 입력하세요: ");
        String op = sc.next();


        if (op.equals("+")) {
            System.out.printf("%d + %d = %d", num1, num2, (num1+num2));
        }
        else if (op.equals("-")) {
            System.out.printf("%d - %d = %d", num1, num2, (num1-num2));
        }
        else if (op.equals("*")) {
            System.out.printf("%d * %d = %d", num1, num2, (num1*num2));
        }
        else if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("0으로는 나눌 수 없습니다!");
            }
            else {
                System.out.printf("%d / %d = %.2f", num1, num2, (double)num1/num2);
            }
        }
    }
}
