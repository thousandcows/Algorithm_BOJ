# Read data
sentence = input()
target = input()
target_length = len(sentence)


# Function to do backtracking
def backtracking(current_sentence: str) -> None:
    # Exit condition
    if len(current_sentence) == target_length:

        if current_sentence == sentence:
            print(1)
            exit()
        else:
            return

    if current_sentence[-1] == "A":
        backtracking(current_sentence[:-1])  # Calculation 1

    if current_sentence[0] == "B":
        backtracking(current_sentence[1:][::-1])  # Calculation 2


# Do backtrack to find answer
backtracking(target)
print(0)  # Print 0 if not possible
