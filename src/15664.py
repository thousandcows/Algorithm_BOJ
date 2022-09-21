import itertools
import sys

N, M = map(int, sys.stdin.readline().split())
numbers = sorted(list(map(int, sys.stdin.readline().split())))

for result in sorted(set(itertools.combinations(numbers, M))):
    print(*result)
