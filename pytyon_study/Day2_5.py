month = int(input("월을 입력하세요: "))

if month >= 3 and month <= 5:
    print("봄입니다!")  
elif month >= 6 and month <= 8:
    print("여름입니다!")
elif month >= 9 and month <= 11:
    print("가을입니다!")
else:
    if month == 1 or month == 2 or month == 12:
        print("겨울입니다!")
    else:
        print("올바른 월을 입력하세요")
