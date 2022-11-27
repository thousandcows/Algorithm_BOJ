import sys
from itertools import permutations
read = sys.stdin.readline

n = int(read())
k = int(read())
card_list = [read().strip() for _ in range(n)]
permutations_list = list(permutations(card_list, k))

result = set()
for case in permutations_list:
    result.add(''.join(case))

print(len(result))
