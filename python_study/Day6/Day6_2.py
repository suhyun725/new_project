
def calc_grade(score):
    if score >= 90: return "A"
    elif score >= 80: return "B"
    elif score >= 70: return "C"
    elif score >= 60: return "D"
    else: return "F"


score = int(input("점수를 입력하세요: "))
print(f"학점: {calc_grade(score)}")