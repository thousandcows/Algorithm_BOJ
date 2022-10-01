import itertools
import sys
from typing import List


def read() -> str:
    return sys.stdin.readline().rstrip()


def solution(word_list: List[tuple]) -> str:
    for case in word_list:
        result = is_palindrome(case[0], case[1])
        if result != "0":
            return result

    return "0"


def is_palindrome(str1: str, str2: str) -> str:
    if str1 + str2 == (str1 + str2)[::-1]:
        return str1 + str2

    if str2 + str1 == (str2 + str1)[::-1]:
        return str2 + str1

    return "0"


T = int(read())

for _ in range(T):
    words = int(read())
    words_list = []

    for _ in range(words):
        words_list.append(read())
    words_combinations = list(itertools.combinations(words_list, 2))
    print(solution(words_combinations))

