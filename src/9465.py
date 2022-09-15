import sys

T = int(sys.stdin.readline())

for _ in range(T):
    stickers = []
    col = int(sys.stdin.readline())
    for _ in range(2):
        stickers.append(list(map(int, sys.stdin.readline().split())))

    for i in range(1, col):
        if i == 1:
            stickers[0][i] += stickers[1][i - 1]
            stickers[1][i] += stickers[0][i - 1]
        else:
            stickers[0][i] += max(stickers[1][i - 1], stickers[1][i - 2])
            stickers[1][i] += max(stickers[0][i - 1], stickers[0][i - 2])

    print(max(stickers[0][col - 1], stickers[1][col - 1]))
