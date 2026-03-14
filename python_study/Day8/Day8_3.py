class Student:
    def __init__(self, name, score):
        self.name = name
        self.score = score

    def print_info(self): 
        print(f"{self.name}: {self.score}점")
    


max = 0
max_stu = ""
stus = []

while True:
    name = input("이름 (0 입력시 종료):")
    if name == "0": break

    score = int(input("점수: "))

    
    stus.append(Student(name, score))

    if score > max:
        max = score
        max_stu = name

if len(stus) == 0:
    print("입력하신 학생이 없습니다!")
else:
    print("--- 학생 명단 ---")
    for i in stus:
        i.print_info()

print(f"최고점: {max_stu} ({max}점)")
