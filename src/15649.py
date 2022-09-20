import sys

N, M = map(int, sys.stdin.readline().split())

case = []


def func():
    if len(case) == M:
        print(*case, sep=' ')
        return

    for i in range(1, N + 1):
        if i not in case:
            case.append(i)
            func()
            case.pop()


func()
