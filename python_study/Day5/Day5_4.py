student = {}

max_stu = 0
max_score = 0


while True:
    name = input("이름 (q 입력시 종료): ")

    if name == "q": break

    score = int(input("점수: "))
    
    student[name] = score

for k,v in student.items():
    if max_score < v : 
        max_stu = k
        max_score = v        

print("--- 학생 명단 ---")
for key, value in student.items():
    print(f"{key}: {value}점")


print(f"최고점 학생: {max_stu} ({max_score}점)")

