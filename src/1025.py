import sys

read = sys.stdin.readline


# Method to judge if the number is the perfect square number
def is_square(number: int) -> int:
    return int(number ** 0.5) ** 2 == number


# Method to do backtracking to find maximum number
def backtracking(row_index: int, row_gap: int, col_index: int, col_gap: int, curr_number: int) -> None:
    global ans, row_length, col_length

    curr_row = row_index + row_gap
    curr_col = col_index + col_gap

    # Exit condition
    if curr_row < 0 or curr_row >= row_length or curr_col < 0 or curr_col >= col_length:
        return

    # Change the current number by shifting to the left
    curr_number = curr_number * 10 + number_table[curr_row][curr_col]

    if is_square(curr_number) and curr_number > ans:
        ans = curr_number

    # Continue backtracking
    backtracking(curr_row, row_gap, curr_col, col_gap, curr_number)


# Read data
row_length, col_length = map(int, read().strip().split())

number_table = [[int(i) for i in read().strip()] for _ in range(row_length)]

ans = -1

# Bruteforce all numbers
for row in range(row_length):
    for col in range(col_length):
        # Bruteforce all gaps
        for row_gap in range(row_length):
            for col_gap in range(col_length):
                # Edge case
                if row_gap == col_gap == 0:
                    curr_val = number_table[row][col]
                    if is_square(curr_val) and curr_val > ans:
                        ans = curr_val
                        continue
                    continue

                # Backtracking
                backtracking(row, row_gap, col, col_gap, number_table[row][col])
                backtracking(row, -row_gap, col, -col_gap, number_table[row][col])
                backtracking(row, -row_gap, col, col_gap, number_table[row][col])
                backtracking(row, row_gap, col, -col_gap, number_table[row][col])

# Print answer
print(ans)
