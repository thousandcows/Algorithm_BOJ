import sys
from itertools import combinations

input = sys.stdin.readline

# Read information
n, cases = map(int, input().split())

# Store the banned combination
combinations_to_avoid = list()

for _ in range(cases):
    new_combi = tuple(map(int, input().split()))
    combinations_to_avoid.append(new_combi)

# Find all possible combinations
all_possible_combinations = list(combinations([i for i in range(1, n + 1)], 3))

ans = 0

# Iterate all cases to see if they match the condition
for possible_case in all_possible_combinations:

    count = 0
    for case in combinations_to_avoid:
        if case[0] in possible_case and case[1] in possible_case:
            break

        count += 1

    if count == cases:
        ans += 1

# Print answer
print(ans)