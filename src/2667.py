from collections import deque


def bfs():
    queue = deque()

    for i in range(size):
        for j in range(size):
            if apartment_map[i][j] == 1:

                queue.append((i, j))

                apartment_map[i][j] += 1

                apartment_group.append(1)

                while queue:
                    row, col = queue.popleft()

                    for x, y in DIRECTION:
                        nx = row + x
                        ny = col + y

                        if 0 <= nx < size and 0 <= ny < size:
                            if apartment_map[nx][ny] == 1:
                                apartment_group[-1] += 1
                                apartment_map[nx][ny] += 1
                                queue.append((nx, ny))



DIRECTION = [(1, 0), (0, 1), (-1, 0), (0, -1)]

# 1. Read the size of the map
size = int(input())

# 2. Map initialization
apartment_map = []
apartment_group = []

for i in range(size):
    apartment_map.append(list(map(int, input())))

# 3. Count the number of apartment group
bfs()
sorted(apartment_group)
print(len(apartment_group))
for i in apartment_group:
    print(i)
