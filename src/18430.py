import sys

N, M = map(int, sys.stdin.readline().split())
wood = list(list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(N))


def dfs(x: int, y: int, score: int) -> None:
    # Change row and column
    if y == M:
        x += 1
        y = 0

    # Exit condition
    if x == N:
        global answer
        answer = max(answer, score)
        return

    # If this wood has not been used
    if not visited[x][y]:
        # Four directions to make boomerang
        direction = [[0, -1, 1, 0], [-1, 0, 0, -1], [-1, 0, 0, 1], [0, 1, 1, 0]]
        for d in direction:
            r1, c1, r2, c2 = d
            row1, col1 = x + r1, y + c1  # boomerang part 1
            row2, col2 = x + r2, y + c2  # boomerang part 2
            # Test each case
            if 0 <= row1 < N and 0 <= row2 < N and 0 <= col1 < M and 0 <= col2 < M:  # Boundary check
                if not visited[row1][col1] and not visited[row2][col2]:  # the parts should not be visited
                    visited[x][y] = True
                    visited[row1][col1] = True
                    visited[row2][col2] = True
                    dfs(x, y + 1, score + wood[x][y] * 2 + wood[row1][col1] + wood[row2][col2])
                    visited[x][y] = False
                    visited[row1][col1] = False
                    visited[row2][col2] = False
    # If this wood has been used
    dfs(x, y + 1, score)


visited = [[False] * M for _ in range(N)]
answer = 0
dfs(0, 0, 0)

print(answer)
