import sys
sys.setrecursionlimit(10000000)

nodes, links = map(int, input().split())

computers = {}
visited = [False for _ in range(nodes + 1)]
counts = {}

for _ in range(links):
    child, parent = map(int, input().split())
    if parent in computers.keys():
        computers[parent].append(child)
    else:
        computers[parent] = [child]


def dfs(index, count):
    visited[index] = True

    if index not in computers.keys():
        return count

    for c in computers[index]:
        count += 1
        if not visited[c]:
            count += dfs(c, 0)
        elif c in counts.keys():
            count += counts[c]

    counts[index] = count
    return count


for i in computers.keys():
    dfs(i, 0)

max_num = max(counts)
for i in range(1, len(counts)):
    if counts[i] == max_num:
        print(i, end=' ')