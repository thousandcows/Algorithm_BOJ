import sys
from typing import List

a, b, c = map(int, sys.stdin.readline().split())

bottle_list = [a, b, c]
ans_set = set()

no_ans_set = set()


def dfs(curr_list: List[int], count: int) -> None:

    # Exit condition
    target = tuple(curr_list)

    # Exit condition
    # If the target already exists in the answer_set
    if target in ans_set:
        return
    # If the target doesn't match the condition, and already tested
    if target in no_ans_set:
        return

    # If the target newly matches the condition
    if curr_list[0] == 0:
        ans_set.add(target)

    # If the target newly doesn't match the condition
    elif curr_list[0] != 0:
        no_ans_set.add(target)

    # Graph search
    for i in range(3):  # bottle to pour out
        for j in range(3):  # bottle to fill
            new_list = curr_list[::]

            # If the bottle overlaps
            if i == j:
                continue

            # # If no water in the bottle or the target is already full
            if curr_list[i] == 0 or curr_list[j] == bottle_list[j]:
                continue

            # If the whole water coule be poured at the target
            if bottle_list[j] - curr_list[j] >= curr_list[i]:
                new_list[j] += curr_list[i]
                new_list[i] = 0
                dfs(new_list, count + 1)

            # If the water still remains in the bottle
            elif bottle_list[j] - curr_list[j] < curr_list[i]:
                new_list[j] = bottle_list[j]
                new_list[i] -= bottle_list[j] - curr_list[j]
                dfs(new_list, count + 1)


dfs([0, 0, c], 0)
ans = list(i[2] for i in ans_set)
ans.sort()

print(*ans)