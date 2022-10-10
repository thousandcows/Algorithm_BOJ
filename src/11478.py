s = input()
word_set = set()

for i in range(len(s)):
    for j in range(i, len(s)):
        word_set.add(s[i:j + 1])

print(len(word_set))