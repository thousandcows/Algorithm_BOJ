import sys

N = int(sys.stdin.readline())

number = list()
number_set = set()


def dfs():
    if len(number) > 0:
        number_set.add(int("".join(map(str, number))))

    for i in range(10):
        if len(number) == 0 or number[-1] > i:
            number.append(i)
            dfs()
            number.pop()


try:
    dfs()
    number_set = sorted(list(number_set))
    print(number_set[N - 1])
except:
    print('-1')
