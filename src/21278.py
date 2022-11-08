import sys
from itertools import combinations

input = sys.stdin.readline
INF = sys.maxsize

# Read the building number and road_number
building_number, road_number = map(int, input().split())
dist_list = [[INF] * building_number for _ in range(building_number)]

# Save distance information in dist_list
for _ in range(road_number):
    b1, b2 = map(int, input().split())
    dist_list[b1 - 1][b2 - 1] = 1
    dist_list[b2 - 1][b1 - 1] = 1

# Use floyd warshall to save all shortest distance information
for intermediate_vertex in range(building_number):

    dist_list[intermediate_vertex][intermediate_vertex] = 0

    for start_vertex in range(building_number):
        for end_vertex in range(building_number):
            dist_list[start_vertex][end_vertex] = min(dist_list[start_vertex][end_vertex],
                                                      dist_list[start_vertex][intermediate_vertex] +
                                                      dist_list[intermediate_vertex][end_vertex])
# Brute force to find answer

ans_hour = INF
first_chicken = 0
second_chicken = 0

for first_store, second_store in combinations(range(building_number), 2):
    total_hours = 0
    for building in range(building_number):
        total_hours += 2 * min(dist_list[building][first_store], dist_list[building][second_store])

    if ans_hour > total_hours:
        ans_hour = total_hours
        first_chicken = first_store + 1
        second_chicken = second_store + 1

# Print answer
print(first_chicken, second_chicken, ans_hour)
