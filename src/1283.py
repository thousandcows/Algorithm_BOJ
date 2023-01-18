import sys

read = sys.stdin.readline
# 1. Read the data
n = int(read())

key_list = []
answer_list = []


def is_new_key(alphabet: str) -> bool:
    if alphabet.lower() in key_list or alphabet.upper() in key_list:
        return False
    return True


def add_new_key(alphabet: str) -> None:
    key_list.append(alphabet.upper())
    key_list.append(alphabet.lower())


# 2. Iterate n times to assign short cuts
for i in range(n):
    curr_list = list(read().split())
    not_completed = True

    # a. check every first letter of the word, and add new key if it exists
    while True:
        for idx, word in enumerate(curr_list):
            if is_new_key(word[0]):
                add_new_key(word[0])
                curr_list[idx] = "[" + word[0] + "]" + word[1:]
                not_completed = False
                break

        if not not_completed:
            break

        # b. scan every letter from left to right and assign it to keys
        for idx, word in enumerate(curr_list):
            for digit, alpha in enumerate(word):
                if is_new_key(alpha):
                    add_new_key(alpha)
                    curr_list[idx] = word[:digit] + "[" + word[digit] + "]" + word[digit + 1:]
                    not_completed = False
                    break
            if not not_completed:
                break

        break
        
    answer_list.append(" ".join(curr_list))

# 3. Print all words
for w in answer_list:
    print(w)
