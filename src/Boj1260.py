from collections import deque

# DFS
def dfs(V, dfs_visited = []):
    # Change the current node to 'visited'
    dfs_visited.append(V)

    # Print this node's value
    print(V, end=" ")

    # Visit connected nodes recursively
    for i in range(len(graph[V])):
        if graph[V][i] == 1 and (i not in dfs_visited):
            dfs(i, dfs_visited)


# BFS
def bfs(V):
    bfs_discovered = [V]

    queue = deque()
    queue.append(V)

    while queue:
        V = queue.popleft()
        print(V, end=" ")

        for i in range(len(graph[V])):
            if graph[V][i] == 1 and (i not in bfs_discovered):
                bfs_discovered.append(i)
                queue.append(i)


# Read graph
# 1. Read N, M, V
N, M, V = map(int, input().split())

# 2. Read graph
graph = [[0] * (N+1) for _ in range(N+1)]

for i in range(M):
    node_one, node_two = map(int, input().split())
    graph[node_one][node_two] = graph[node_two][node_one] = 1

# 3. Execute Depth-First-Search
dfs(V)
print()
# 4. Execute Breadth-First-Search
bfs(V)
