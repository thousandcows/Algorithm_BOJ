N = int(input())

plus_card_list = [0 for _ in range(10000001)]
minus_card_list = [0 for _ in range(10000001)]

card_info = list(map(int, input().split()))

for num in card_info:
    if num > 0:
        plus_card_list[num] += 1
    else:
        minus_card_list[-num] += 1

M = int(input())
check_info = list(map(int, input().split()))

for num in check_info:
    print(plus_card_list[num] if num > 0 else minus_card_list[-num], end=" ")
