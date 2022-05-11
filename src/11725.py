from collections import deque
import sys

sys.setrecursionlimit(1000000)


# 0. DFS
def dfs(start):
    for n in node_list[start]:
        if visit_list[n] == 0:
            visit_list[n] = start
            dfs(n)


# 0. BFS
def bfs():
    queue = deque()
    queue.append(1)

    visited = [0 for i in range(nodes + 1)]  # list to contain parent node
    visited[1] = 1

    while queue:

        v = queue.popleft()

        for i in node_list[v]:
            if visited[i] == 0:
                visited[i] = v
                queue.append(i)

    for i in visited[2:]:
        print(i)


# 1. Read tree information
nodes = int(input())

node_list = [[] for i in range(nodes + 1)]

for _ in range(nodes - 1):
    one, two = map(int, sys.stdin.readline().split())
    node_list[one].append(two)
    node_list[two].append(one)

# 2. Execute bfs to find each parent node
bfs()

visit_list = [0] * (nodes + 1)

dfs(1)

for i in visit_list[2:]:
    print(i)
