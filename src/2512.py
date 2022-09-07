# Input
import sys

N = int(input())
budget_list = list(map(int, sys.stdin.readline().split()))
budget_available = int(input())

limits = []

sum_list = sum(budget_list)


def binary_search(start, end):
    if start > end:
        return

    mid = (start + end) // 2

    new_sum = 0
    for b in budget_list:
        if b > mid:
            new_sum += mid
        else:
            new_sum += b

    if new_sum > budget_available:
        binary_search(start, mid - 1)
    elif new_sum < budget_available and mid <= max(budget_list):
        limits.append(mid)
        binary_search(mid + 1, end)
    else:
        print(mid)
        exit(0)


budget_list.sort()
binary_search(budget_list[0], budget_list[-1])
if limits:
    print(max(limits))
else:
    print(budget_available // N)