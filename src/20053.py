import sys

input = sys.stdin.readline

n = int(input())

for _ in range(n):
    length = input()
    curr_list = list(map(int, input().split(' ')))  # clarifying the separator would be faster
    print(min(curr_list), max(curr_list))
