def calc_even(list):
    evens = []
    
    for i in list:
        if i % 2 == 0: evens.append(i)
    
    return evens


nums = []

while True:
    num = int(input("숫자를 입력하세요 (0을 입력하면 종료): "))

    if num == 0: break

    nums.append(num)


if len(nums) == 0:
    print("입력된 숫자가 없습니다!")
else:
    print(f"짝수: {calc_even(nums)}")