import sys
from collections import deque

read = sys.stdin.readline

# Read game information
number_of_people = int(read())
target_count = int(read())
word_to_count = int(read())

# Declare deque and save people
queue = deque()
for i in range(0, number_of_people):
    queue.append(i)

curr_turn = 1   # counts the turn of the game
count = 0   # counts the target word
ans = 0     # saves the current person's number

# Runs until count == target_count
while count < target_count:

    # Sentence of each turn
    curr_sentence = [0, 1, 0, 1] + [0 for _ in range(curr_turn + 1)] + [1 for _ in range(curr_turn + 1)]

    for word in curr_sentence:
        ans = queue.popleft()
        if word == word_to_count:
            count += 1

        if count == target_count:
            break

        queue.append(ans)

    curr_turn += 1

# Print answer
print(ans)
