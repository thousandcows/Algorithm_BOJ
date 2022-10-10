s = input()

word_set = set()


def dfs(idx: int, word: str) -> None:
    if idx > len(s) - 1:
        return

    new_word = word + s[idx]
    word_set.add(new_word)

    dfs(idx + 1, new_word)


for i, w in enumerate(s):
    word_set.add(w)
    dfs(i + 1, w)

print(len(word_set))
