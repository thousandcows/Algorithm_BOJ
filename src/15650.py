import sys

N, M = map(int, sys.stdin.readline().split())

case = []


def dfs(i):
    if len(case) == M:
        print(*case, sep=' ')
        return

    for j in range(i, N + 1):
        if j not in case:
            case.append(j)
            dfs(j)
            case.pop()


dfs(1)
