import sys

N, M = map(int, sys.stdin.readline().split())
numbers = sorted(list(map(int, sys.stdin.readline().split())))


def dfs(count: int, start: int, sequence: str):
    if count == M:
        print(sequence)
        return

    checker = 0

    for i in range(start, N):

        if checker == numbers[i]:
            continue

        checker = numbers[i]

        dfs(count + 1, i, sequence + str(numbers[i]) + ' ')


dfs(0, 0, "")