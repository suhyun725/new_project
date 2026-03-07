num1 = int(input("첫 번쨰 숫자:"))

num2 = int(input("두 번쨰 숫자:"))

op = input("연산자 (+,-,*,/):")

if op == "+":
    print(f"{num1} + {num2} = {num1 + num2}")
elif op == "-":
    print(f"{num1} - {num2} = {num1 - num2}") 
elif op == "*":
    print((f"{num1} * {num2} = {num1 * num2}"))
elif op == "/":
    if num2 == 0:
        print("0으로 나눌 수 없습니다!")
    else:
        print((f"{num1} / {num2} = {num1 / num2}"))