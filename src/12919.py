# Read data
sentence = input()
target = input()
target_length = len(target)


# Function to do backtracking
def backtracking(current_sentence: str) -> None:
    # Exit condition
    if len(current_sentence) == target_length:
        if current_sentence == target:
            print(1)
            exit()
        else:
            return

    backtracking(current_sentence + "A")  # Calculation 1
    backtracking((current_sentence + "B")[::-1])  # Calculation 2


# Do backtrack to find answer
backtracking(sentence)
print(0)  # Print 0 if not possible
