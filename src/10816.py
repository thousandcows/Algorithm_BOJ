from collections import defaultdict
N = int(input())
card_list = defaultdict(int)

for num in input().split():
    card_list[num] += 1

M = int(input())
for num in input().split():
    print(card_list[num] if num in card_list else 0, end=" ")
