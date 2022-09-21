import sys

N, M = map(int, sys.stdin.readline().split())
numbers = sorted(list(map(int, sys.stdin.readline().split())))

sequence = []


def dfs():
    if len(sequence) == M:
        sys.stdout.write(' '.join(sequence) + '\n')
        return

    for i in range(N):
        sequence.append(str(numbers[i]))
        dfs()
        sequence.pop()


dfs()