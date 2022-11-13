import sys

input = sys.stdin.readline

# Read information
n, cases = map(int, input().split())

# Store the banned combination
combinations_to_avoid = [[] for _ in range(n + 1)]

for _ in range(cases):
    one, two = map(int, input().split())
    combinations_to_avoid[one].append(two)
    combinations_to_avoid[two].append(one)

# Find all possible combinations
ans = 0

for i in range(1, n - 1):
    for j in range(i + 1, n):
        if j in combinations_to_avoid[i]:
            continue
        for k in range(j + 1, n + 1):
            if k in combinations_to_avoid[i]:
                continue

            if k in combinations_to_avoid[j]:
                continue

            ans += 1

# Print answer
print(ans)
