s = input()

word_set = set()


# function to create new word
def dfs(idx: int, word: str) -> None:
    if idx > len(s) - 1:
        return

    new_word = word + s[idx]
    word_set.add(new_word)

    dfs(idx + 1, new_word)


# Make word starting at each index
for i in range(len(s)):

    word_set.add(s[i])
    dfs(i + 1, s[i])

# Print answer
print(len(word_set))
