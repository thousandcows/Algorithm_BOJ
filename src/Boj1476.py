# 1. Read E, S, M
E, S, M = map(int, input().split(' '))
max_E = 15
max_S = 28
max_M = 19

# 2. Find the soonest year coming
year = 0

# a. E == S == M
if E == S == M:
    year = E

# b.
else:
    year = 0

# 3. Print the year
print(year)
