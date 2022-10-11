N = int(input())

counted_card_list = [[0, 0]]

cards_in_pocket = list(map(int, input().split()))
cards_in_pocket.sort()

for num in cards_in_pocket:
    if num == counted_card_list[-1][0]:
        counted_card_list[-1][1] += 1
    else:
        counted_card_list.append([num, 1])


M = int(input())
numbers_to_check = list(map(int, input().split()))


def find_number_count(num: int, start: int, end: int) -> int:
    if start > end:
        return 0

    mid = (start + end) // 2

    if counted_card_list[mid][0] == num:
        return counted_card_list[mid][1]

    if counted_card_list[mid][0] > num:
        return find_number_count(num, start, mid - 1)
    else:
        return find_number_count(num, mid + 1, end)


end = len(counted_card_list) - 1

for num in numbers_to_check:
    print(find_number_count(num, 0, end), end=" ")
