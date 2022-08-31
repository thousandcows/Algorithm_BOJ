def find_min_worms(x, y):
    global col, row, area, visited, count

    directions = [(1, 0), (-1, 0), (0, -1), (0, 1)]

    visited[y][x] = True

    for d in directions:
        nx = x + d[0]
        ny = y + d[1]
        if 0 <= ny < row and 0 <= nx < col:
            if not visited[ny][nx] and area[ny][nx] == 1:
                find_min_worms(nx, ny)


# 입력
N = int(input())

for i in range(N):
    # 배추 밭 정보 입력
    col, row, num = map(int, input().split(' '))
    area = [[0 for _ in range(col)] for _ in range(row)]
    # 배추 위치 정보 입력
    for j in range(num):
        x, y = map(int, input().split(' '))
        area[y][x] = 1
    # 흰 지렁이 수
    count = 0
    # 방문 처리할 배열
    visited = [[False for _ in range(col)] for _ in range(row)]
    # 출력
    for r in range(row):
        for c in range(col):
            if not visited[r][c] and area[r][c] == 1:
                count += 1
                find_min_worms(c, r)
    print(count)
