import sys

read = sys.stdin.readline

# 1. Read information
n = int(read())
ingredient_list = [tuple(map(int, read().split())) for _ in range(n)]

# 2. Initialize answer variable
answer = sys.maxsize


# 3. Define function to do recursion
def recur(idx: int, sour_taste: int, bitter_taste: int):
    global answer

    new_sour_taste = sour_taste * ingredient_list[idx][0]
    new_bitter_taste = bitter_taste + ingredient_list[idx][1]
    taste_score_gap = abs(new_sour_taste - new_bitter_taste)

    answer = min(answer, taste_score_gap)

    if idx == n - 1:
        return

    for j in range(idx + 1, n):
        recur(j, new_sour_taste, new_bitter_taste)


# 4. Bruteforce to find minimum difference
for i, taste in enumerate(ingredient_list):
    sour, bitter = taste
    recur(i, 1, 0)

print(answer)
