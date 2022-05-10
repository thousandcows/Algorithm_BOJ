from collections import deque


# 0. BFS
def bfs():
    queue = deque()
    queue.append(1)

    visited = [0 for i in range(nodes + 1)]  # list to contain parent node

    while queue:

        v = queue.popleft()

        for i in range(len(node_list)):
            if node_list[v][i] == 1 and not visited[i]:
                visited[i] = v
                queue.append(i)

    for i in range(2, len(visited)):
        print(visited[i])


# 1. Read tree information
nodes = int(input())

node_list = [[0] * (nodes + 1) for i in range(nodes + 1)]

for _ in range(nodes-1):
    one, two = map(int, input().split())
    node_list[one][two] = node_list[two][one] = 1

# 2. Execute bfs to find each parent node
bfs()
