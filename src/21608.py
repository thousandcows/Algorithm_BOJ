import sys

# Read data
N = int(sys.stdin.readline())
length = N * N
classroom = list([0] * N for _ in range(N))
like_list = [[] for _ in range(length + 1)]
direction = [(0, -1), (0, 1), (-1, 0), (1, 0)]


for _ in range(length):
    info = list(map(int, sys.stdin.readline().rstrip().split()))
    likes = info[1:]
    like_list[info[0]] = likes

    if length == 0:
        classroom[1][1] = info[0]
        continue

    evaluation = []  # likes, empty, location

    # Find the best seat for the student
    for r in range(N):
        for c in range(N):
            sum_likes, sum_empty = 0, 0
            if classroom[r][c] == 0:
                for d in direction:
                    nr = r + d[0]
                    nc = c + d[1]
                    if 0 <= nr < N and 0 <= nc < N:
                        if classroom[nr][nc] in likes:
                            sum_likes += 1
                        if classroom[nr][nc] == 0:
                            sum_empty += 1
                evaluation.append((sum_likes, sum_empty, (r, c)))
    evaluation.sort(key=lambda x: (-x[0], -x[1], x[2]))
    nx, ny = evaluation[0][2][0], evaluation[0][2][1]
    classroom[nx][ny] = info[0]


# Print answer
answer = 0
for r in range(N):
    for c in range(N):
        score = 0
        for d in direction:
            nr = r + d[0]
            nc = c + d[1]
            if 0 <= nr < N and 0 <= nc < N:
                if classroom[nr][nc] in like_list[classroom[r][c]]:
                    score += 1
                    continue
        if score != 0:
            answer += 10 ** (score - 1)

print(answer)
