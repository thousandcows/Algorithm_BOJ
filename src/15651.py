import sys

N, M = map(int, sys.stdin.readline().split())

case = []


def dfs():
    if len(case) == M:
        sys.stdout.write(' '.join(case) + "\n")
        return

    for j in range(1, N + 1):
        case.append(str(j))
        dfs()
        case.pop()


dfs()
