from collections import deque


# 0. BFS
def bfs():
    queue = deque()
    queue.append(1)

    visited = [1]

    while queue:
        v = queue.popleft()

        for i in range(len(computer_network)):
            if computer_network[v][i] == 1 and i not in visited:
                queue.append(i)
                visited.append(i)
    print(len(visited) - 1)


# 1. Read Computer network
computers = int(input())
pairs = int(input())

# 2. Make two dimensional list to mark its network
computer_network = [[0] * (computers + 1) for i in range(computers + 1)]

for i in range(pairs):
    one, two = map(int, input().split())
    computer_network[one][two] = computer_network[two][one] = 1

bfs()
