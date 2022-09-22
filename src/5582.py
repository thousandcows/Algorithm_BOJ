import sys

pattern1 = sys.stdin.readline().rstrip()
pattern2 = sys.stdin.readline().rstrip()
h, w = len(pattern1), len(pattern2)
dp = list([0] * (w + 1) for _ in range(h + 1))

max_val = 0
for i in range(1, h + 1):
    for j in range(1, w + 1):
        if pattern1[i - 1] == pattern2[j - 1]:
            dp[i][j] = dp[i - 1][j - 1] + 1
            max_val = dp[i][j] if dp[i][j] > max_val else max_val

print(max_val)
