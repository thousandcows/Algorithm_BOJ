import sys

read = sys.stdin.readline

# 1. Read counseling information
number_of_days = int(read())

counseling_list = []

for _ in range(number_of_days):
    counseling_list.append(tuple(map(int, read().split())))

# 2. Calculate maximum profit with dynamic programming
dp_list = [0 for _ in range(20)]

for day in range(number_of_days):
    dp_list[day + counseling_list[day][0]] = max(
        max(dp_list[:day + 1]) + counseling_list[day][1],
        dp_list[day + counseling_list[day][0]]
    )

# Print answer
print(max(dp_list[:number_of_days + 1]))
