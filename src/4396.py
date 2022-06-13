def count_mine(x, y):
    count = 0
    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < n:
            if mine_map[nx][ny] == '*':
                count += 1
    return count


# 1. Read the information
n = int(input())
mine_map = [list(input()) for _ in range(n)]
game_map = [list(input()) for _ in range(n)]
result = [['.'] * n for _ in range(n)]

dx = [-1, -1, -1, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 1, -1, 0, 1]

# 2. Draw the situation
for i in range(n):
    for j in range(n):
        if mine_map[i][j] == '.' and game_map[i][j] == 'x':
            result[i][j] = count_mine(i, j)

        if mine_map[i][j] == '*' and game_map[i][j] == 'x':
            for k in range(n):
                for l in range(n):
                    if mine_map[k][l] == '*':
                        result[k][l] = '*'

# 3. Print the result
for i in range(n):
    for j in range(n):
        print(result[i][j], end='')
    print()
