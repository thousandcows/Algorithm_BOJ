import itertools
import sys

N, M = map(int, sys.stdin.readline().split())
numbers = sorted(list(map(int, sys.stdin.readline().split())))


def dfs(start, sequence):
    if start == M:
        sys.stdout.write(sequence + '\n')
        return

    tmp = 0
    for i in range(N):
        if tmp == numbers[i]:
            continue
        tmp = numbers[i]
        dfs(start + 1, sequence + str(tmp) + ' ')


dfs(0, "")