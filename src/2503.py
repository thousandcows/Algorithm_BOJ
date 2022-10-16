import sys
from itertools import permutations

# Read and record information
test_case = int(sys.stdin.readline())

test_number_list = list()

for _ in range(test_case):
    test_number_list.append(list(map(int, sys.stdin.readline().split())))


# Create permutation list
candidate_number_list = list(permutations(['1', '2', '3', '4', '5', '6', '7', '8', '9'], 3))

ans = 0

# Check every number that could match the condition
for original_number in candidate_number_list:

    # Variable to count matching cases
    qualified_numbers_count = 0

    # Test every number in questions
    for case in test_number_list:
        # Test case information
        number_to_compare, target_strike, target_ball = case

        strike_current = 0
        ball_current = 0

        for idx, digit in enumerate(str(number_to_compare)):
            # Strike
            if original_number[idx] == digit:
                strike_current += 1
            # Ball
            elif digit in original_number:
                ball_current += 1

        # Check if the strike and ball match the condition
        if strike_current == target_strike and ball_current == target_ball:
            qualified_numbers_count += 1

    # If the number could be suggested in the question
    if qualified_numbers_count == test_case:
        ans += 1

# Print answer
print(ans)
