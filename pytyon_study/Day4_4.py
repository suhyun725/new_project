nums = [] ## 숫자 리스트
hidx = 0  ## 최댓값 인덱스
lidx = 0  ## 최솟값 인덱스

for i in range (0, 5):
    nums.append(int(input(f"{i+1}번째 숫자: ")))

    if nums[i] > nums[hidx]: hidx = i
    if nums[i] < nums[lidx]: lidx = i


print(f"최댓값: {nums[hidx]} ({hidx+1}번째)")
print(f"최솟값: {nums[lidx]} ({lidx+1}번째)")
