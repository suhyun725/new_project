stus = {}


def get_grade(score):
    if score >= 90: return "A"
    elif score >= 80: return "B"
    elif score >= 70: return "C"
    elif score >= 60: return "D"
    else: return "F"

def print_result(students):
    print("--- 학생 성적표 ---")
    for k, v in students.items():
        print(f"{k}: {v}점 ({get_grade(v)})")



while True:
    name = input("이름 (0 입력시 종료): ")
    if name == "0": break
    score = int(input("점수: "))

    stus[name] = score


print_result(stus)
