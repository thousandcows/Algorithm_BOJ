from collections import deque


# BFS
def bfs():
    queue = deque()
    queue.append(N)

    while queue:

        v = queue.popleft()

        if v == K:
            print(visited[v])
            break

        for i in (v - 1, v + 1, v * 2):
            if 0 <= i <= 100000 and not visited[i]:
                visited[i] = visited[v] + 1
                queue.append(i)


# Read N and K
N, K = map(int, input().split())
visited = [0] * 100001

# Find the fastest time with BFS
bfs()
