from collections import deque
import sys


def bfs(x, y):
    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        for d in DIRECTION:
            nx = x + d[0]
            ny = y + d[1]

            if 0 <= nx < N and 0 <= ny < M and maze[nx][ny] == 1:

                # if maze[nx][ny] == 1:
                maze[nx][ny] = maze[x][y] + 1
                queue.append((nx, ny))

    return maze[N - 1][M - 1]


DIRECTION = [(1, 0), (-1, 0), (0, 1), (0, -1)]

# 1. Read N, M
N, M = map(int, input().split())

# 2. Get the maze information
maze = []

for i in range(N):
    num_list = list(map(int, input()))
    maze.append([j for j in num_list])

# 3. Find the shortest path
print(bfs(0, 0))
