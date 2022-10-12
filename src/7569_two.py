import sys
from collections import deque

width, height, floor = map(int, input().split())
box_list = list(list(list(map(int, sys.stdin.readline().split())) for _ in range(height)) for _ in range(floor))

# Use deque to solve the problem
queue = deque()
for f in range(floor):
    for row in range(height):
        for col in range(width):
            if box_list[f][row][col] == 1:
                queue.append([f, row, col])

# 6 directions to check at each '1'
directions = [
    [0, 0, -1],
    [0, 0, 1],
    [0, 1, 0],
    [0, -1, 0],
    [-1, 0, 0],
    [1, 0, 0],
]

# Function to scan every location
while queue:
    f, r, c = queue.popleft()

    # Search in 6 directions
    for d in directions:
        new_floor = f + d[0]
        new_row = r + d[1]
        new_col = c + d[2]

        # Check if the new location exists
        if 0 <= new_floor < floor and 0 <= new_row < height and 0 <= new_col < width and box_list[new_floor][new_row][new_col] == 0:
            box_list[new_floor][new_row][new_col] = box_list[f][r][c] + 1
            queue.append([new_floor, new_row, new_col])

# Search all tomatoes and print answer
min_days = 0

for f in range(floor):
    for row in range(height):
        for col in range(width):
            if box_list[f][row][col] == 0:
                print(-1)
                exit(0)

            min_days = max(box_list[f][row][col], min_days)

print(min_days - 1)
