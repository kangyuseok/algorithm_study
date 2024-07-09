# 원래 푼 방법 - 이렇게 하니 문제 발생..
x = int(input())
# count = 0

# while x != 1:
#     if x % 3 == 0:
#         x //= 3
#         count += 1
#     elif x % 2 == 0:
#         x //= 2
#         count += 1
#     else:
#         x -= 1
#         count += 1

# print(count)

# 두번째 방법

dp = [0] * (x+1) # 계산된 값을 저장해둠.
print(dp)
# 배열 초기화

for i in range(2, x+1):
    # 1빼기 
    dp[i] = dp[i-1] + 1
    # 2로 나누기, 1을 만드는 최소 연산 횟수를 더함
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i // 2] + 1)
        print(dp)
    # 3으로 나누기, 위와 동일
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i // 3] + 1)

#x를 1로 만드는데 필요한 최소 연산 횟수 출력
print(dp[x])