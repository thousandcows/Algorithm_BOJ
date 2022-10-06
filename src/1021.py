# Read data
N, M = map(int, input().split())
queue = [int(x) for x in range(1, N + 1)]
order_list = list(map(int, input().split()))

# Variable to save counts
count = 0

for target in order_list:

    # case 2
    if queue.index(target) + 1 <= len(queue) - queue.index(target):
        while queue[0] != target:
            queue = queue[1:] + [queue[0]]
            count += 1
    # case 3
    else:
        while queue[0] != target:
            queue = [queue[-1]] + queue[:-1]
            count += 1

    # case 1
    queue = queue[1:]

# Print answer
print(count)
