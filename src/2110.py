import sys

house_num, routers = map(int, sys.stdin.readline().strip().split())

houses = []
answer = 0

# Put house locations to list
for _ in range(house_num):
    houses.append(int(sys.stdin.readline().strip()))

# Timsort houses in asc
houses.sort()


# Use binary search to find the maximum distance
def binary_search(start, end):
    global answer
    # Exit condition
    if start > end:
        return

    mid = (start + end) // 2  # mid: distance to examine

    count = 1
    front_house = houses[0]  # first house is always included

    for idx, value in enumerate(houses[1:]):
        if value - front_house >= mid:  # If the distance is larger than mid, count += 1
            count += 1
            front_house = houses[idx + 1]

    # Divide cases
    if count >= routers:
        answer = mid
        binary_search(mid + 1, end)
    elif count < routers:
        binary_search(start, mid - 1)


# Find answer
binary_search(1, houses[-1] - houses[0])
print(answer)
