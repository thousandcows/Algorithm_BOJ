# 1. Make cows dictionary
cows = {}

# 2. Cnt for counting
cnt = 0

# 3. Number of watches
N = int(input())

for _ in range(N):
    number, location = map(int, input().split())

    # 4. If cow is not in dictionary, add
    if number not in cows:
        cows[number] = location
    # 5. Else, if cow's location changed, add count
    else:
        if cows[number] != location:
            cnt += 1
            cows[number] = location

print(cnt)