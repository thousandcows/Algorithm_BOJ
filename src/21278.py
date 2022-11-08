import sys
from collections import deque

read = sys.stdin.readline

# Read the building number and road_number
building_number, road_number = map(int, read().split())

# Make 2 dimensional list and store graph information
graph = [[] for _ in range(building_number + 1)]
for _ in range(road_number):
    b1, b2 = map(int, read().split())
    graph[b1].append(b2)
    graph[b2].append(b1)

# Choose Two building as chicken store and find the best option
ans_hours, ans_chicken_one, ans_chicken_two = building_number * road_number, 0, 0

for first_store in range(1, building_number):
    for second_store in range(first_store + 1, building_number + 1):

        total_hours = 0

        for departure_building in range(1, building_number + 1):
            queue = deque()
            queue.append(departure_building)
            visited = [True] + [False for _ in range(building_number)]
            hour_of_this_case = 0

            while queue:

                curr_location = queue.popleft()

                # If the current location is the chicken store
                if curr_location == first_store or curr_location == second_store:
                    total_hours += hour_of_this_case * 2
                    break

                # If not chicken store: visit next building
                for next_building in graph[curr_location]:
                    if not visited[next_building]:
                        queue.append(next_building)

                hour_of_this_case += 1

        # Update answers with lower time cost
        if total_hours < ans_hours:
            ans_chicken_one = first_store
            ans_chicken_two = second_store
            ans_hours = total_hours

        elif total_hours == ans_hours:
            if first_store < ans_chicken_one:
                ans_chicken_one = first_store
                ans_chicken_two = second_store
            elif first_store == ans_chicken_one and second_store < ans_chicken_two:
                ans_chicken_one = first_store
                ans_chicken_two = second_store

# Print answer
print(ans_chicken_one, ans_chicken_two, ans_hours)
