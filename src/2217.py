import sys

input = sys.stdin.readline
# 1. Read the info
n = int(input())
rope_list = [int(input()) for _ in range(n)]
rope_list.sort()

# 2. Find the maximum weight
ans = 0
length = len(rope_list)
for idx, num in enumerate(rope_list):
    ans = max(ans, num * (length - idx))

# 3. Print the answer
print(ans)
