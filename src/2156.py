# Input
import sys


def read():
    return int(sys.stdin.readline())


N = read()

wine = [0] * 10000
for i in range(N):
    wine[i] = read()

dp = [0] * 10000
dp[0] = wine[0]
dp[1] = wine[0] + wine[1]
dp[2] = max(wine[1] + wine[2], wine[0] + wine[2], dp[1])

# Find maximum amount of wine
for i in range(3, N):
    dp[i] = max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i], dp[i - 1])


# Output
print(max(dp))