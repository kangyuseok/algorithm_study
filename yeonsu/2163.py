N,M = map(int, input().split()) 
# 배열의 크기 입력

arr = [list(map(int, input().split())) for _ in range(N)] 
# N개의 줄에 M개의 정수로 배열이 주어짐

K = int(input())
# 합을 구할 부분의 개수

arr2 = [list(map(int,input().split())) for _ in range(K)] 
# K개의 줄에 4개의 정수로 주어짐

dp = [[0 for i in range(M+1)] for _ in range(N+1)]
# 2차원 배열 생성

for i in range(1, N+1):
    for j in range(1, M+1):
        dp[i][j] = dp[i-1][j] + dp[i][j-1] + arr[i-1][j-1] - dp[i-1][j-1]
    for _, line in enumerate(arr2):
        i,j,x,y = line
        print(dp[x][y]-(dp[x][j-1]+dp[i-1][y])+dp[i-1][j-1])
        # (0,0부터 x,y까지의 합)에서 (0,0부터 x,j-1까지의 합)을 빼고 
        # (0,0부터 i-1,y까지의 합)을 빼고 두 번 빼준 (0,0부터 i-1,j-1까지의 합)을 
        # 다시 더해주면 됨