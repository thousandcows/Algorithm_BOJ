import sys

re = sys.stdin.readline

n = int(re())
number_list = [int(i) for i in re().split()]
target_number = int(re())

number_list.sort()
ans = 0

left, right = 0, len(number_list) - 1

while left != right:
    if number_list[left] + number_list[right] < target_number:
        left += 1
    elif number_list[left] + number_list[right] > target_number:
        right -= 1
    else:
        ans += 1
        left += 1

print(ans)
