text = input("문자열을 입력하세요: ")

print(f"앞 5글자: {text[:5]}")
print(f"뒤 6글자: {text[-6:]}")
print(f"뒤집기: {text[::-1]}")
print(f"2칸씩 건너뛰기: {text[::2]}")