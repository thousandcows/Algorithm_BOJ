from sys import stdin

# Input
N = stdin.readline()
card_list = sorted((list(map(int, stdin.readline().split()))))
M = int(stdin.readline())
check_list = list(map(int, stdin.readline().split()))
result_list = [0 for _ in range(M)]


# Binary Search
def binary_search(start, end, target):

    if start > end:
        return -1

    mid = (start + end) // 2

    if card_list[mid] == target:
        return mid

    elif card_list[mid] > target:
        return binary_search(start, mid - 1, target)
    else:
        return binary_search(mid + 1, end, target)


# Output
for i, card in enumerate(check_list):
    result = binary_search(0, len(card_list) - 1, card)
    if result != -1:
        result_list[i] = 1

print(*result_list)
