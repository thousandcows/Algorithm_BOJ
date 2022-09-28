import sys
from typing import List

N, K = map(int, sys.stdin.readline().rstrip().split())

bags = list()

for _ in range(N):
    knapsack = tuple(map(int, sys.stdin.readline().rstrip().split()))  # knapsack = (weight, value)
    bags.append(knapsack)


def pack_knapsack(bags: List[tuple]) -> int:
    capacity = K
    pack = []

    for i in range(len(bags) + 1):
        pack.append([])
        for c in range(capacity + 1):
            if i == 0 or c == 0:
                pack[i].append(0)

            elif bags[i - 1][0] <= c:  # 배낭의 무게가 용량 이하인 경우
                pack[i].append(
                    max(
                        bags[i - 1][1] + pack[i - 1][c - bags[i - 1][0]],
                        # 현재 배낭의 가치와 + 현재 배낭을 담고 남은 무게에서 담을 수 있는 최대 가치
                        pack[i - 1][c]  # dp의 이전 최댓값
                    ))
            else:  # 배낭의 무게가 용량을 초과하는 경우
                pack[i].append(pack[i - 1][c])

    return pack[-1][-1]


print(pack_knapsack(bags))
