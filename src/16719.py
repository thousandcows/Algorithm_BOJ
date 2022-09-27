import sys
from typing import List

word_input = list(sys.stdin.readline().rstrip())
word_arr = list("" for _ in range(len(word_input)))


def print_word(word: List[str], start: int) -> None:

    if not word:
        return

    index = word.index(min(word))
    word_arr[start + index] = min(word)

    print(''.join(word_arr))

    print_word(word[index + 1:], start + index + 1)

    print_word(word[:index], start)


print_word(word_input, 0)
