# 입력
import sys

# 기본 정보
people, relations = map(int, input().split())
arr = [[] for _ in range(people)]
visited = [False] * people

# 친구 관계 입력
for i in range(relations):
    idx, friend = map(int, input().split())
    arr[idx].append(friend)
    arr[friend].append(idx)


# 깊이 우선 탐색
def dfs(count, number):
    if count == 4:
        print(1)
        sys.exit(0)

    for f in arr[number]:
        if not visited[f]:
            visited[f] = True
            dfs(count + 1, f)
            visited[f] = False


for idx in range(len(arr)):
    visited[idx] = True
    dfs(0, idx)
    visited[idx] = False

print(0)
