import itertools
import sys

N = int(sys.stdin.readline())

# List to store counts
answers = list()


def odd_counter(number: int, count: int):
    # Count the odd number
    for n in str(number):
        if int(n) % 2 == 1:
            count += 1

    # Exit condition
    if number < 10:
        answers.append(count)

    # Scan every digit to count
    if 10 <= number < 100:
        new_number = (number // 10) + (number % 10)
        odd_counter(new_number, count)
    elif 100 <= number:
        # Find all cases to divide the number
        cases = list(itertools.combinations([i for i in range(1, len(str(number)))], 2))
        str_number = str(number)
        for case in cases:
            first_cut = case[0]
            second_cut = case[1]
            new_number = int(str_number[:first_cut]) + int(str_number[first_cut:second_cut]) + int(
                str_number[second_cut:])
            odd_counter(new_number, count)


# Print answer
odd_counter(N, 0)
print(min(answers), max(answers))
