import sys
from collections import deque
from typing import List

N, L, R = map(int, sys.stdin.readline().split())
country_list = list(list(map(int, sys.stdin.readline().strip().split())) for _ in range(N))

directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]


def bfs(visit_list: List[List[bool]]) -> int:
    queue = deque()
    confederation_of_the_day = list()

    total_population_moved_in_confederation = 0
    movement_happen_count = 0

    for row in range(N):
        for col in range(N):

            # Add first element to deque
            if len(queue) == 0 and not visit_list[row][col]:
                queue.append([row, col])
                total_population_moved_in_confederation += country_list[row][col]
                visit_list[row][col] = True

            # Make each confederation_of_the_day using deque
            while queue:
                curr_row, curr_col = queue.popleft()
                curr_country_population = country_list[curr_row][curr_col]

                confederation_of_the_day.append([curr_row, curr_col])

                # Search up, down, left, right to open borders
                for d in directions:
                    new_row = curr_row + d[0]
                    new_col = curr_col + d[1]

                    if 0 > new_row or new_row >= N or 0 > new_col or new_col >= N or visit_list[new_row][new_col]:
                        continue

                    score_between_borders = abs(curr_country_population - country_list[new_row][new_col])

                    if L > score_between_borders or R < score_between_borders:
                        continue

                    queue.append([new_row, new_col])
                    total_population_moved_in_confederation += country_list[new_row][new_col]
                    visit_list[new_row][new_col] = True

            # Count as movement only if confederation is larger than one country
            if len(confederation_of_the_day) > 1:

                # Allocate new population in each country
                new_population = int(total_population_moved_in_confederation / len(confederation_of_the_day))

                for location in confederation_of_the_day:
                    country_list[location[0]][location[1]] = new_population
                    movement_happen_count += 1

            # Initialize variables
            total_population_moved_in_confederation = 0
            confederation_of_the_day.clear()

    return movement_happen_count


# Varaible to count days of movement
days_count = 0

while True:
    # List to check visits
    visited = list(list(False for _ in range(N)) for _ in range(N))

    # Do bfs
    curr_count = bfs(visited)

    # Exit condition
    if curr_count == 0:
        print(days_count)
        break
    else:
        days_count += 1
