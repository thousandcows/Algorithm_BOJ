from itertools import permutations

n = int(input())
k = int(input())
card_list = [input() for _ in range(n)]
permutations_list = list(permutations(card_list, k))

result = set()
for case in permutations_list:
    result.add(''.join(case))

print(len(result))
