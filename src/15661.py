import sys
from itertools import combinations

input = sys.stdin.readline

table_size = int(input())
capability_storage = dict()
players = [i for i in range(1, table_size + 1)]

for i in range(1, table_size):
    for j in range(i + 1, table_size + 1):
        capability_storage[(i, j)] = 0


def add_capability(team_members):
    total = 0
    for first in range(len(team_members) - 1):
        for second in range(first + 1, len(team_members)):
            total += capability_storage[(team_members[first], team_members[second])]

    return total


for row_number in range(table_size):
    numbers = map(int, input().split())
    for col_number, capability in enumerate(numbers):
        if row_number < col_number:
            capability_storage[(row_number + 1, col_number + 1)] += capability
        elif row_number > col_number:
            capability_storage[(col_number + 1, row_number + 1)] += capability

min_value = table_size ** 2 * 100
for start_team_count in range(1, (table_size // 2) + 1):
    start_team_cases = list(combinations(players, start_team_count))

    for start_team in start_team_cases:
        link_team = list()
        for player in players:
            if player not in start_team:
                link_team.append(player)
        current_difference = abs(add_capability(start_team) - add_capability(link_team))

        if current_difference < min_value:
            min_value = current_difference

print(min_value)
