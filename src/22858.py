import sys
from typing import List

N, K = map(int, sys.stdin.readline().split())

S = [0] + list(map(int, sys.stdin.readline().split()))
D = [0] + list(map(int, sys.stdin.readline().split()))


def swap_cards() -> List[int]:
    global K, S, D
    P = [0] * (N + 1)
    for _ in range(K):
        for idx, number in enumerate(S[1:]):
            P[D[idx + 1]] = number

        S = P

    return P


result = swap_cards()
print(*result[1:], sep=' ')
