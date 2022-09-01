from collections import deque

# Input
w, h = map(int, input().split())

tomato = [list(map(int, input().split())) for _ in range(h)]

queue = deque()

for i in range(h):
    for j in range(w):
        if tomato[i][j] == 1:
            queue.append((i, j))

min_days = 0


def scan_tomato():
    while queue:
        x, y = queue.popleft()

        directions = [[0, -1], [0, 1], [-1, 0], [1, 0]]

        for d in directions:
            nx = x + d[1]
            ny = y + d[0]

            if 0 <= nx < h and 0 <= ny < w and tomato[nx][ny] == 0:
                tomato[nx][ny] = tomato[x][y] + 1
                queue.append((nx, ny))


scan_tomato()
for t in tomato:
    for j in t:
        if j == 0:
            print(-1)
            exit(0)
    min_days = max(min_days, max(t))
print(min_days - 1)
