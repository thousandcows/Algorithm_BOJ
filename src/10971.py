import sys

N = int(sys.stdin.readline())
city_list = list(list(map(int, sys.stdin.readline().split())) for _ in range(N))

visited = []
scores = []


def dfs(start, score):
    # Base Condition
    if len(visited) == N:
        cost = city_list[start][visited[0]]
        if cost != 0:
            scores.append(score + cost)
            return

    # Visit cities recursively
    for destination in range(N):
        cost = city_list[start][destination]
        if cost != 0 and destination not in visited:
            visited.append(destination)
            dfs(destination, score + cost)
            visited.pop()


# Check every city as a starting point
for i in range(N):
    visited.append(i)
    dfs(i, 0)
    visited.pop()

print(min(scores))
