def bfs(node_list, idx, visited):
    # 방문 처리
    visited[idx] = True

    for n in node_list[idx]:
        if not visited[n]:
            bfs(node_list, n, visited)


# Input
N, M = map(int, input().split(' '))

# Nodes
node_list = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)

# 간선 정보 입력
for _ in range(M):
    u, v = map(int, input().split(' '))
    node_list[v].append(u)
    node_list[u].append(v)

# 탐색
count = 0
for i in range(1, N + 1):
    if not visited[i]:
        if node_list[i]:
            bfs(node_list, i, visited)
            count += 1
        else:
            count += 1
            visited[i] = True
# Output
print(count)
