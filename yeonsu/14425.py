# 1번 해결법
N,M = map(int, input().split())
count = 0
arr = []
arr2 = []

for _ in range(N):
    table = list(map(str, input().strip()))
    arr.append(table)

for _ in range(M):
    table = list(map(str, input().strip()))
    if table in arr:
        count += 1

print(count)

# 2번 해결법
# set을 이용해서 시간복잡도 줄이기
arr_set = set()

for _ in range(N):
    table = input().strip()
    arr_set.add(table)
for _ in range(M):
    table = input().strip()
    if table in arr_set:
        count += 1

print(count)