def count_bingo(x, y):
    global cross_left
    global cross_right
    global bingo_cnt

    if x == y:
        cross_left += 1
        if cross_left == 5:
            bingo_cnt += 1
            if bingo_cnt == 3:
                return

    if x + y == 4:
        cross_right += 1
        if cross_right == 5:
            bingo_cnt += 1
            if bingo_cnt == 3:
                return

    horizontal[x] += 1

    if horizontal[x] == 5:
        bingo_cnt += 1
        if bingo_cnt == 3:
            return

    vertical[y] += 1

    if vertical[y] == 5:
        bingo_cnt += 1
        if bingo_cnt == 3:
            return


bingo = {}

for i in range(5):
    line = list(input().split())
    for j in range(5):
        bingo[line[j]] = (i, j)

# 2. Play bingo
cross_left = 0
cross_right = 0
horizontal = [0 for _ in range(5)]
vertical = [0 for _ in range(5)]

bingo_cnt = 0
cnt = 0

for _ in range(5):
    number_called = list(input().split())

    if bingo_cnt == 3:
        break

    for j in number_called:
        x, y = bingo[j]

        cnt += 1

        count_bingo(x, y)

        if bingo_cnt == 3:
            print(cnt)
            break