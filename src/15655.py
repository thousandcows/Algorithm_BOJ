import sys

N, M = map(int, sys.stdin.readline().split())
numbers = sorted(list(map(int, sys.stdin.readline().split())))
sequence = []


def dfs(start):
    if len(sequence) == M:
        sys.stdout.write(' '.join(sequence) + '\n')
        return

    for i in range(start, N):
        if numbers[i] not in sequence:
            sequence.append(str(numbers[i]))
            dfs(i + 1)
            sequence.pop()


dfs(0)