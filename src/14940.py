import sys
from collections import deque

# 입력
row, col = map(int, sys.stdin.readline().split())

map_info = [list(map(int, sys.stdin.readline().split())) for _ in range(row)]
visited = [[False for _ in range(col)] for _ in range(row)]
result = [[0 for _ in range(col)] for _ in range(row)]


# 너비 우선 탐색
def bfs(i, j):
    queue = deque()
    queue.append((i, j))

    while queue:
        x, y = queue.popleft()

        direction = [(1, 0), (0, 1), (-1, 0), (0, -1)]
        for d in direction:
            nx = x + d[0]
            ny = y + d[1]
            if 0 <= nx < row and 0 <= ny < col:
                if not visited[nx][ny] and map_info[nx][ny] == 1:
                    visited[nx][ny] = True
                    result[nx][ny] = result[x][y] + 1
                    queue.append((nx, ny))


for i in range(row):
    for j in range(col):
        if map_info[i][j] == 2:
            result[i][j] = 0
            visited[i][j] = True
            bfs(i, j)

# 출력
for i in range(row):
    for j in range(col):
        if map_info[i][j] == 1 and not visited[i][j]:
            print(-1, end=" ")
        else:
            print(result[i][j], end=" ")
    print()
