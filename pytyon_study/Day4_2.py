stu = int(input("학생 수를 입력하세요: "))

scores = [] ## 점수 리스트
total = 0  ## 점수 총합
hidx = 0 ## 최고점 인덱스
lidx = 0 ## 최저점 인덱스
grades = [] ## 학점 리스트

for i in range(0, stu):
    scores.append(int(input(f"{i+1}번 학생 점수: ")))

    total += scores[i]
    
    if scores[i] > scores[hidx]: hidx = i
    
    if scores[i] < scores[lidx]: lidx = i

    if scores[i] >= 90:
        grades.append("A")
    elif scores[i] >= 80:
        grades.append("B")
    elif scores[i] >= 70:
        grades.append("C")
    elif scores[i] >= 60:
        grades.append("D")
    else: grades.append("F")
    

print("--- 결과 ---")
print(f"총합: {total}")
print(f"평균: {total/stu:.2f}")
print(f"최고점: {scores[hidx]}")
print(f"최저점: {scores[lidx]}")

print("--- 학점 ---")

for i, grade in enumerate(grades):
    print(f"{i+1}번 학생: {grade}")
