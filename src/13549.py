from collections import deque

# Input
start, target = map(int, input().split())

visited = [False] * 100001


def bfs(location, count):
    global target

    queue = deque()
    queue.append([location, count])

    while queue:
        new_location, new_count = queue.popleft()
        visited[new_location] = True

        if new_location == target:
            print(new_count)
            exit(0)

        for d in [new_location * 2, new_location - 1, new_location + 1]:
            if 0 <= d <= 100000:
                if not visited[d]:
                    if new_location != 0 and (d // new_location) == 2:
                        queue.append([d, new_count])
                    else:
                        queue.append([d, new_count + 1])


bfs(start, 0)
