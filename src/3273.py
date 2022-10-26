import sys

re = sys.stdin.readline

n = int(re())
number_list = [int(i) for i in re().split()]
target_number = int(re())

nums_map = {}
ans = 0
for i, num in enumerate(number_list):
    nums_map[num] = i

for i, num in enumerate(number_list):
    if target_number - num in nums_map and i != nums_map[target_number - num]:
        ans += 1


print(ans // 2)
