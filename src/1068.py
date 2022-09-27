import sys

N = int(sys.stdin.readline())
parent_info = list(map(int, sys.stdin.readline().split()))
node_to_delete = int(sys.stdin.readline())

# Add graph information and find the root node index
graph = dict()

for idx in range(N):
    if idx == node_to_delete or parent_info[idx] == node_to_delete:
        continue

    if parent_info[idx] not in graph:
        graph[parent_info[idx]] = [idx]
        continue

    graph[parent_info[idx]].append(idx)


# Function to do DFS
def dfs(start_node: int) -> None:
    global count
    # Base condition
    if start_node not in graph:
        count += 1
        return
    # DFS nodes in parent
    for node in graph[start_node]:
        dfs(node)


# Variable to count leaf nodes
count = 0

if -1 in graph:
    dfs(-1)

print(count)

