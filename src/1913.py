# 1. Read the information
N = int(input())
target = int(input())

# 2. Draw the snail_board
snail_board = [[0 for _ in range(N)] for _ in range(N)]
d_reset = (-1, 0)
d_right = (0, 1)
d_down = (1, 0)
d_left = (0, -1)
d_up = (-1, 0)

nx = ny = N // 2

snail_board[nx][ny] = 1
count_number = 1

for i in range(3, N + 1, 2):

    # reset
    count_number += 1
    nx += d_reset[0]
    ny += d_reset[1]
    snail_board[nx][ny] = count_number

    # right
    for _ in range(i - 2):
        count_number += 1
        nx += d_right[0]
        ny += d_right[1]
        snail_board[nx][ny] = count_number

    # down, left, up
    for direction in [d_down, d_left, d_up]:
        for j in range(i - 1):
            count_number += 1
            nx += direction[0]
            ny += direction[1]
            snail_board[nx][ny] = count_number

#3. Print the result
flag = False
for i in range(N):
    for j in range(N):
        value = snail_board[i][j]
        if not flag and value == target:
            target = str(i+1) + " " + str(j+1)
        print(value, end=" ")
    print()
print(target)