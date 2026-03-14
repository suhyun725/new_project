text = input("문자열을 입력하세요: ")

if (text.replace(" ", "").isalpha()):
    print(text.upper())
    print(text.lower())
    print(len(text))
    print(text[::-1])
else:
    print("문자열을 입력하세요!")