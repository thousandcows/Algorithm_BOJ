from collections import deque

nodes, links = map(int, input().split())

computers = [[] for _ in range(nodes + 1)]

for _ in range(links):
    child, parent = map(int, input().split())
    computers[parent].append(child)


def bfs(index):
    queue = deque()
    queue.append(index)
    count = 0
    visited = [0] * (nodes + 1)
    visited[index] = 1
    while queue:
        next_index = queue.popleft()
        count += 1
        for i in computers[next_index]:
            if not visited[i]:
                visited[i] = 1
                queue.append(i)
    return count - 1


max_num = -1
max_idx = []
for i in range(len(computers)):
    if computers[i]:
        result = bfs(i)
        if result > max_num:
            max_num = result
            max_idx = [i]
        elif result == max_num:
            max_idx.append(i)

print(*max_idx)
