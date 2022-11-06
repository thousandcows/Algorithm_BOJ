# Read n, k
n, k = map(int, input().split())

# Variable for counting
count = 0

for h in range(n + 1):  # hour
    for m in range(60):     # minute
        for s in range(60):     # second
            # Case1: k == 0
            if k == 0:
                if h < 10 or m < 10 or s < 10 or h % 10 == 0 or m % 10 == 0 or s % 10 == 0:
                    count += 1
            # Case2: k != 0
            elif k != 0:
                # Check every digit of hour
                if h // 10 == k or h % 10 == k or m // 10 == k or m % 10 == k or s // 10 == k or s % 10 == k:
                    count += 1
                    continue

# Print count
print(count)