total = 0
highest = 0
lowest = 100
i = 0
count = 0

while True:
    grade = int(input("점수를 입력하세요 (0 입력시 종료): "))
    if grade == 0: break

    total += grade

    if grade > highest: highest = grade
    if grade < lowest: lowest = grade
    count += 1
        
if count == 0: 
    print("입력된 점수가 없습니다.")
else:
    print("--- 결과 ---")
    print(f"총합: {total}")
    print(f"평균: {total/count:.2f}")    
    print(f"최고점: {highest}")
    print(f"최소점: {lowest}")