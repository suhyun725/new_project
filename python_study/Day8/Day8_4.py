class BankAccount:
    balance = 0
    
    def deposit(self, amount):
        BankAccount.balance += amount
        print(f"입금완료! 잔액: {BankAccount.balance}원")
    def withdraw(self,amount):
        if BankAccount.balance < amount:
            print("잔액이 부족합니다!")
        else:
            BankAccount.balance -= amount
            print(f"출금완료! 잔액: {BankAccount.balance}원")
    def get_balance(self):
        print(f"현재 잔액: {BankAccount.balance}")

s1 = BankAccount()

while True:
    print("1. 입금")
    print("2. 출금")
    print("3. 잔액 조회")
    print("4. 종료")
    print()
    selc = int(input("선택: "))

    print()

    if selc == 1:
        amount = int(input("입금액: "))
        s1.deposit(amount)
        print()
    elif selc == 2:
        amount = int(input("출금액: "))
        s1.withdraw(amount)
        print()
    elif selc == 3:
        s1.get_balance()
        print()
    elif selc == 4:
        print("종료합니다!")
        break
    else: 
        print("바른 업무를 선택하세요")
        print()
        