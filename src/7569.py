import sys
from collections import deque

width, height, floor = map(int, input().split())
box_list = list(list(map(int, sys.stdin.readline().split())) for _ in range(height * floor))

# Use deque to solve the problem
queue = deque()

for row in range(height * floor):
    for col in range(width):
        if box_list[row][col] == 1:
            queue.append([row, col])

directions = [
    [1, 0],
    [-1, 0],
    [0, -1],
    [0, 1],
    [-height, 0],
    [height, 0],
]
# 6 directions to check at each '1'


# Function to scan every location
while queue:
    r, c = queue.popleft()

    # Search in 6 directions
    for i in range(6):
        new_row = r + directions[i][0]
        new_col = c + directions[i][1]

        if i == 0 and r % height == height - 1:
            continue

        if i == 1 and r % height == 0:
            continue

        # Check if the new location exists
        if 0 <= new_row < height * floor and 0 <= new_col < width and box_list[new_row][new_col] == 0:

            box_list[new_row][new_col] = box_list[r][c] + 1
            queue.append([new_row, new_col])

# Search all tomatoes and print answer
min_days = 0

for row in range(height * floor):
    for col in range(width):
        if box_list[row][col] == 0:
            print(-1)
            exit(0)
        min_days = max(box_list[row][col], min_days)

print(min_days - 1 if min_days > 0 else 0)
