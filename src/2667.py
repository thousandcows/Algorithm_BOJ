def bfs(map, visited, row, col):
    global size, count

    # 방문 처리
    visited[row][col] = True

    # 방향을 나타내는 direction
    directions = [[0, 1], [1, 0], [-1, 0], [0, -1]]
    for d in directions:
        nr = d[1] + row
        nc = d[0] + col
        if 0 <= nr < size and 0 <= nc < size:
            if not visited[nr][nc] and map[nr][nc] == 1:
                count += 1
                bfs(map, visited, nr, nc)

# 입력
size = int(input())

map = []
visited = []
for _ in range(size):
    row = input()
    map.append([int(i) for i in row])
    visited.append([False for i in row])

# BFS로 지도 탐색
group = []
count = 1

for row in range(size):
    for col in range(size):
        if map[row][col] == 1 and not visited[row][col]:
            count = 1
            bfs(map, visited, row, col)
            group.append(count)

# 정렬하여 출력
print(len(group))
for g in sorted(group):
    print(g)