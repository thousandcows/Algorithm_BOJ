import sys
from itertools import permutations

N, M = map(int, sys.stdin.readline().split())
numbers = list(map(int, sys.stdin.readline().split()))
numbers.sort()

sys.stdout.write('\n'.join(map(' '.join, permutations(map(str, numbers), M))))
print(''.join(map(str, numbers)))