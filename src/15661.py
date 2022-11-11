import sys
from itertools import combinations

input = sys.stdin.readline

table_size = int(input())
players = [i for i in range(1, table_size + 1)]
capability_store = [[int(i) for i in input().split()] for _ in range(table_size)]


def add_capability(team_members):
    total = 0
    for i in range(len(team_members) - 1):
        for j in range(i + 1, len(team_members)):
            first = team_members[i]
            second = team_members[j]
            total += capability_store[first - 1][second - 1] + capability_store[second - 1][first - 1]

    return total


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
