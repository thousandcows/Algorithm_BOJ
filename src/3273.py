n = int(input())
number_list = [int(i) for i in input().split(' ')]
target_number = int(input())

number_list.sort()

left, right = 0, len(number_list) - 1
ans = 0

while left < right:
    if number_list[left] + number_list[right] < target_number:
        left += 1
    elif number_list[left] + number_list[right] > target_number:
        right -= 1
    else:
        ans += 1
        left += 1
        right -= 1

print(ans)
