# 입력 받기
name = input("이름을 입력하세요: ")
age = int(input("나이를 입력하세요: "))
height = float(input("키를 입력하세요 (cm): ")) #키는 실수형으로

# 입력 받은 값의 타입
print(type(name))
print(type(age))
print(type(height))

# 결과
print(f"안녕하세요, {name}님!")
print(f"현재 나이: {age}살 / 10년 후 나이: {age + 10}살")
print(f"현재 키: {height}cm / 10cm 줄이면: {height - 10}cm")
