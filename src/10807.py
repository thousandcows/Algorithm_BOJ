import sys

input = sys.stdin.readline

n = input()
num_list = list(map(int, input().split(' ')))
target = int(input())

print(num_list.count(target))
