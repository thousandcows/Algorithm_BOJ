# 1. Read S
S = list(input())

# 2. Find min_num
min_num = 0
count = 0

for i in range(1, len(S)):
    if i > 0 and S[i] != S[i - 1]:
        count += 1

min_num = int((count if (count % 2 == 0) else count + 1) / 2)

# 3. Print the answer
print(min_num)