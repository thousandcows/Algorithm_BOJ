import sys

read = sys.stdin.readline


def check(row, col):
    for i in range(5):
        x = row + directions[i][0]
        y = col + directions[i][1]
        if visited[x][y] == 1:
            return False
    return True


def backtracking(recursion_count):
    global score, answer

    if recursion_count == 3:
        answer = min(answer, score)
        return

    for i in range(1, n - 1):
        for j in range(1, n - 1):
            if check(i, j):
                for k in range(5):
                    x = i + directions[k][0]
                    y = j + directions[k][1]
                    visited[x][y] = 1
                    score += g[x][y]

                backtracking(recursion_count + 1)

                for k in range(5):
                    x = i + directions[k][0]
                    y = j + directions[k][1]
                    visited[x][y] = 0
                    score -= g[x][y]


n = int(read())
g = [list(map(int, read().split())) for i in range(n)]

directions = [(0, 0), (0, -1), (0, 1), (-1, 0), (1, 0)]

visited = [[0] * n for _ in range(n)]
answer = sys.maxsize
score = 0
backtracking(0)
print(answer)
