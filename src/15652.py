import sys

N, M = map(int, sys.stdin.readline().split())

sequence = []


def dfs(start):
    if len(sequence) == M:
        sys.stdout.write(' '.join(sequence) + '\n')
        return

    for i in range(start, N + 1):
        sequence.append(str(i))
        dfs(i)
        sequence.pop()


dfs(1)


