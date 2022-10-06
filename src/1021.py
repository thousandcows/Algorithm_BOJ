from collections import deque

# Read data
N, M = map(int, input().split())
order = list(map(int, input().split()))

# Use two deque to calculate
queue = deque()
for i in range(1, N + 1):
    queue.append(i)

number_order = deque()
for o in order:
    number_order.append(o)

# Variable to save counts
count = 0

while len(queue) > N - M:
    # case 1
    if queue[0] == number_order[0]:
        queue.popleft()
        number_order.popleft()

    else:
        # Compare the distance from the start and the end of the queue to the target
        target = number_order[0]
        start_to_target_distance = queue.index(target) - 0
        end_to_target_distance = len(queue) - 1 - queue.index(target)

        # case 2
        if start_to_target_distance <= end_to_target_distance:
            while queue[0] != number_order[0]:
                new_end = queue.popleft()
                queue.append(new_end)
                count += 1
        # case 3
        else:
            while queue[0] != number_order[0]:
                new_start = queue.pop()
                queue.appendleft(new_start)
                count += 1

# Print answer
print(count)
