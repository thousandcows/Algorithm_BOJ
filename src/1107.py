#1. Read channel info and set variables
default_channel = 100
target = int(input())
M = int(input())
btns = ['0','1','2','3','4','5','6','7','8','9', '+', '-']

broken_btns = []
if M != 0:
    broken_btns = input().split(' ')

# 2. Find minimum btns to be in the targeted channel
min_times = 500000

count = 0
# a. find the closest number from the target
# a-1.
# target == default_channel => count = 0 => min_times = count
if target == default_channel:
    min_times = 0
# a-2.
# target < default_channel

# a-3.
# target > default_channel

# b. use + and - button to adjust


# 3. Print the minimum count
print(min_times)

