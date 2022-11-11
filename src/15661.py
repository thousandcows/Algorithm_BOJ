import sys
from itertools import combinations

input = sys.stdin.readline

# Read data
table_size = int(input())
player_combination_capability = [list(map(int, input().split())) for _ in range(table_size)]

# Calculate the sum of each row and column
row_capability = [sum(i) for i in player_combination_capability]
col_capability = [sum(i) for i in zip(*player_combination_capability)]

# Store the sum of row and col of same index
capability_sum_list = [i + j for i, j in zip(row_capability, col_capability)]

total_capability = sum(row_capability + col_capability) // 2    # sum of total capability

answer = sys.maxsize    # variable to store answer

# Find the answer with for-loop
for start_team_count in range(1, table_size // 2 + 1):

    start_team_cases = list(combinations(capability_sum_list, start_team_count))

    for start_team in start_team_cases:

        answer = min(answer, abs(total_capability - sum(start_team)))

        if answer == 0:
            break

    if answer == 0:
        break

# Print answer
print(answer)
