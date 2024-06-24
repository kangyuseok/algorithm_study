# 1. 입력받기 : data
# 2. 1~30이 들어있는 배열 만들기 : arr
# 3. data 순회. 요소가 arr에 없으면 요소 제거.
# 4. arr 소팅
# 5. 출력 


import sys

data = []

for _ in range(28):
    number = int(sys.stdin.readline().strip())
    data.append(number)

arr = [i+1 for i in range(30)]

# --------------------------

for num in data:
    if (num in arr):
        arr.remove(num)

# --------------------------

sorted_arr = sorted(arr)

print(sorted_arr[0])
print(sorted_arr[1])