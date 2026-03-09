student = {}

while True:
    name = input("이름 (q 입력시 종료): ")
    
    if name == "q": break
    
    score = int(input("점수: "))

    student[name] = score


print("--- 학생 명단 ---")

for key, value in student.items():
    print(f"{key}: {value}점")

while True:
    search = input("검색할 이름 (q 입력시 종료): ")

    if search == "q": break
    

    if search in student:
        print(f"{search}: {student.get(search)}점")
    else: print("명단에 없습니다!")

