import sys

N, K = map(int, sys.stdin.readline().rstrip().split())

bags = list(tuple(map(int, sys.stdin.readline().rstrip().split())) for _ in range(N))
bags.sort()


def pack_knapsack(capacity: int) -> int:
    dp = [0] * (capacity + 1)

    for weight, value in bags:
        for i in range(capacity, -1, -1):
            if i - weight < 0:
                break
            dp[i] = max(dp[i], value + dp[i - weight])

    return dp[capacity]


print(pack_knapsack(K))
