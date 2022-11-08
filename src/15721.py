# Read game information
number_of_people = int(input())
goal = int(input())
target_word = int(input())

curr_turn = 1   # counts the turn of the game
word_count = 0   # counts the target word
total_count = 0

# Runs until count == target_count
while word_count < goal:

    # Sentence of each turn
    curr_sentence = [0, 1, 0, 1] + [0 for _ in range(curr_turn + 1)] + [1 for _ in range(curr_turn + 1)]

    for word in curr_sentence:
        if word == target_word:
            word_count += 1

        total_count += 1

        if word_count == goal:
            break

    curr_turn += 1

# Print answer
result = total_count % number_of_people
ans = result - 1 if result != 0 else number_of_people - 1
print(ans)