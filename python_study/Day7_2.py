text = input("문장을 입력하세요: ")

words = text.split()
long_word = ""

for i in words:
    if len(i) > len(long_word): long_word = i


print(f"단어 개수: {len(words)}")
print(f"가장 긴 단어: {long_word}")
print(f"'python' 포함 여부: {'python' in words}")