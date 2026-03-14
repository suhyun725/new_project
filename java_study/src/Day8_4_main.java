import java.util.Scanner;

public class Day8_4_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        Day8_4_BankAccount s1 = new Day8_4_BankAccount();

        while (true) {
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 조회");
            System.out.println("4. 종료");
            System.out.print("원하시는 업무를 선택하세요: ");

            int serv = sc.nextInt();

            if (serv == 1) {
                System.out.print("입금액: ");
                amount = sc.nextInt();
                s1.deposit(amount);
            }
            else if (serv == 2) {
                System.out.print("출금액: ");
                amount = sc.nextInt();
                s1.Withdraw(amount);
            }
            else if (serv == 3) {
                s1.getBalance();
            }
            else if (serv == 4) {
                System.out.println("종료합니다!");
                break;
            }
            else {
                System.out.println("올바른 업무를 선택해주세요");
            }
        }










    }
}
