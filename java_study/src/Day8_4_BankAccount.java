public class Day8_4_BankAccount {
    int balance;

    public void deposit(int amount) {
        balance += amount;
        System.out.printf("입금 완료! 잔액: %d%n", balance);
    }
    public void Withdraw(int amount) {
        if (balance < amount) System.out.println("잔액이 부족합니다!");
        else {
            balance -= amount;
            System.out.printf("출금 완료! 잔액: %d%n", balance);
        }
    }
    public void getBalance() {
        System.out.printf("현재 잔액: %d%n", balance);
    }
}
