num = int(input("단어 수를 입력하세요: "))
words = []

for i in range(0, num):
    word = input(f"{i+1}번째 단어: ")

    words.append(word)


for i in words:
    print(f"{i} → {i[::-1]}")