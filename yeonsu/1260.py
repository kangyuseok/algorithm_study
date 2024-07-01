from collections import deque

N,M,V = map(int,input().split())

graph =[[0] * (N+1) for _ in range(N+1)]

for i in range(M):
    x, y = map(int,input().split())
    graph[x][y] = graph[y][x] = 1

visited_dfs = [0] * (N+1)
visited_bfs = [0] * (N+1)

def dfs(V):
    visited_dfs[V] = True
    print(V, end=' ')
    for i in range(1,N+1):
        if not visited_dfs[i] and graph[V][i] == 1:
            dfs(i)


def bfs(V):
    queue = deque([V])
    visited_bfs[V] = True

    while queue:
        V = queue.popleft()
        print(V, end=' ')
        for i in range(1, N+1):
            if not visited_bfs[i] and graph[V][i] == 1:
                queue.append(i)
                visited_bfs[i] = True

dfs(V)
print()
bfs(V)