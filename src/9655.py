import sys
# Input

N = int(sys.stdin.readline())
board = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]
count = [[0 for _ in range(N)] for _ in range(N)]
count[0][0] = 1

# Calculation
for x in range(N):
    for y in range(N):

        if x == N - 1 and y == N - 1:
            continue

        value = board[x][y]

        for d in ([x + value, y], [x, y + value]):
            nx = d[0]
            ny = d[1]
            if 0 <= nx < N and 0 <= ny < N:
                count[nx][ny] += count[x][y]

# Output
print(count[N - 1][N - 1])