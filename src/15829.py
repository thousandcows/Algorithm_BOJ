import sys

L = int(sys.stdin.readline())
S = sys.stdin.readline().rstrip()

alp_code = "0abcdefghijklmnopqrstuvwxyz"
ans = 0
for i in range(L):
    ans += (alp_code.index(S[i])) * (31 ** i)

print(ans % 1234567891)