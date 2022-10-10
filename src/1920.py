N = int(input())

num_list = set(i for i in input().split())

M = int(input())

for w in input().split():
    print(1 if w in num_list else 0)