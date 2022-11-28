import sys

read = sys.stdin.readline

# 1. Read counseling information
number_of_days = int(read()) - 1

counseling_session_list = []

for _ in range(number_of_days + 1):
    session_info = list(map(int, read().split()))
    counseling_session_list.append(session_info)

# 2. Calculate maximum profit
max_profit = 0


def backtracking(current_day: int, last_profit: int):
    global max_profit

    counseling_ending_time = current_day + counseling_session_list[current_day][0] - 1

    # Exit condition: if the counseling ends later than the last day
    if counseling_ending_time > number_of_days:
        return

    # Update max_profit
    current_profit = last_profit + counseling_session_list[current_day][1]

    if current_profit > max_profit:
        max_profit = current_profit

    # Scan the rest of days of counseling sessions
    for next_day in range(counseling_ending_time + 1, number_of_days + 1):
        backtracking(next_day, current_profit)

    # End function if it's the last counseling of this case
    return


# Bruteforce all scenario
for day, information in enumerate(counseling_session_list):
    backtracking(day, 0)

# Print answer
print(max_profit)
