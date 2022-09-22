import sys

pattern1 = sys.stdin.readline().rstrip()
pattern2 = sys.stdin.readline().rstrip()
h, w = len(pattern1), len(pattern2
                          )
dp = list([0] * (w + 1) for _ in range(h + 1))


def lcs(s1, s2):
    for i in range(1, h + 1):
        for j in range(1, w + 1):
            if pattern1[i - 1] == pattern2[j - 1]:
                dp[i][j] = dp[i - 1][j - 1] + 1
            else:
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
    return dp[-1][-1]


print(lcs(pattern1, pattern2))
