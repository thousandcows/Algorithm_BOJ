import sys

read = sys.stdin.readline

# Read game information
number_of_people = int(read())
target_count = int(read())
word_to_count = int(read())

curr_turn = 1   # counts the turn of the game
count = 0   # counts the target word
total_count = 0

# Runs until count == target_count
while count < target_count:

    # Sentence of each turn
    curr_sentence = [0, 1, 0, 1] + [0 for _ in range(curr_turn + 1)] + [1 for _ in range(curr_turn + 1)]

    for word in curr_sentence:
        if word == word_to_count:
            count += 1

        total_count += 1

        if count == target_count:
            break

    curr_turn += 1

# Print answer
result = total_count % number_of_people
ans = result - 1 if result != 0 else number_of_people - 1
print(ans)