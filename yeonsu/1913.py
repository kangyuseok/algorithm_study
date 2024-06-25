n = int(input())
target = int(input())

# n x n 크기의 테이블을 0으로 초기화하여 생성
table = [[0] * n for _ in range(n)]

# 방향 배열: 하, 우, 상, 좌
dx = [1, 0, -1, 0]  # 행의 변화량
dy = [0, 1, 0, -1]  # 열의 변화량

# 시작점 (좌상단 코너)
x, y = 0, 0
# 첫 번째 이동 방향은 아래로 설정
direction = 0
# 채울 숫자의 초기값을 n*n으로 설정
num = n * n

# 테이블을 나선형으로 채우기 위해 n * n 번 반복
for _ in range(n * n):
    table[x][y] = num  # 현재 위치를 num으로 채움

    if num == target: # 만약 타겟값과 현재 테이블의 값이 같다면
        target_check = (x+1, y+1) # 타켓의 좌표를 넣어줌 +1씩 해야함.. 문제가 그럼..

    num -= 1  # num을 1 감소

    # 다음 위치 계산
    nx, ny = x + dx[direction], y + dy[direction]

    # 다음 위치가 테이블 범위 내에 있고 아직 채워지지 않았다면
    if 0 <= nx < n and 0 <= ny < n and table[nx][ny] == 0:
        x, y = nx, ny  # 다음 위치로 이동
    else:
        # 다음 위치가 범위를 벗어나거나 이미 채워졌다면
        direction = (direction + 1) % 4  # 방향을 바꿈 (하 -> 우 -> 상 -> 좌 순서)
        x += dx[direction]  # 새로운 방향으로 이동
        y += dy[direction]


# 테이블 출력
for row in table:
    print(*row)
print(f"{target_check[0]} {target_check[1]}")
