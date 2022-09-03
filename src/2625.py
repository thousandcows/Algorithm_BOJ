# Input
play_record = [list(map(int, input().split())) for _ in range(19)]

direction_x = [0, 1, 1, -1]
direction_y = [1, 0, 1, 1]


for x in range(19):
    for y in range(19):
        stone = play_record[x][y]

        if stone != 0:
            for i in range(4):
                cnt = 1
                nx = x + direction_x[i]
                ny = y + direction_y[i]

                while 0 <= nx < 19 and 0 <= ny < 19 and play_record[nx][ny] == stone:
                    cnt += 1

                    if cnt == 5:
                        if 0 <= x - direction_x[i] < 19 and 0 <= y - direction_y[i] < 19 and play_record[x - direction_x[i]][y - direction_y[i]] == stone:
                            break
                        if 0 <= nx + direction_x[i] < 19 and 0 <= ny + direction_y[i] < 19 and play_record[nx + direction_x[i]][ny + direction_y[i]] == stone:
                            break
                        print(stone)
                        print(x + 1, y + 1)
                        exit(0)

                    nx += direction_x[i]
                    ny += direction_y[i]
print(0)