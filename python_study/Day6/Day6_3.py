scores = []
highest = 0
lowest = 100

def calc_score(scores):
    total = sum(scores)
    avg = sum(scores)/len(scores)
    highest = max(scores)
    lowest = min(scores)

    return total, avg, highest, lowest

for i in range(1, 6):
    scores.append(int(input(f"{i}번째 점수: ")))


total, avg, highest, lowest = calc_score(scores)

print(f"총합: {total}")
print(f"평균: {avg:.2f}")
print(f"최고점: {highest}")
print(f"최저점: {lowest}")

    