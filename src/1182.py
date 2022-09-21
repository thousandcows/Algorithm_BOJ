import itertools
import sys

N, S = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

count = 0
for i in range(1, N + 1):
    result = list(itertools.combinations(arr, i))
    for r in result:
        if sum(r) == S:
            count += 1

print(count)
