# 출석부
# 빈 배열 선언
input_num = []

# input을 int형으로 28개 받아줌 .sptrp()는 공백제거
for i in range(28):
    x = int(input().strip())
    input_num.append(x) # 배열에 저장

# 집합으로 변환
input_set = set(input_num)

# 1부터 31번까지 돌면서 input_set에 포함되지 않은 숫자를 찾음
for i in range(1,31):
    if i not in input_set:
        print(i)
