n, k = map(int, input().split())

cnt = 0
target = str(k)

for h in range(n + 1):
    if h < 10:
        h = '0' + str(h)
    for m in range(60):
        if m < 10:
            m = '0' + str(m)
        for s in range(60):
            if s < 10:
                s = '0' + str(s)
            if target in str(h) + str(m) + str(s):
                cnt += 1
print(cnt)
