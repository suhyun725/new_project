words = {}
word = ""

while True:
    word = input("단어 입력 (0입력시 종료): ")
    
    if word == "0": break

    words[word] = words.get(word, 0)+1


print("--- 단어 카운트 ---")

for k, v in words.items():
    print(f"{k}: {v}번")