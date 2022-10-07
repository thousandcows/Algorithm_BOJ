from collections import deque

n, m, r = map(int, input().split())
arr = list(list(map(int, input().split())) for _ in range(n))

row_start = 0
row_end = n
col_start = 0
col_end = m
row_length = n
col_length = m
rotater = deque()
ans = list(list(0 for _ in range(m)) for _ in range(n))

while row_length > 0 and col_length > 0:

    row_curr, col_curr = row_start, col_start

    # Add elements counter-clockwise

    for _ in range(2 * (row_length + col_length) - 4):

        # Go down from the starting point
        if row_start <= row_curr < row_end - 1 and col_curr == col_start:
            rotater.append(arr[row_curr][col_curr])
            row_curr += 1

        # Right after finishing going down
        elif row_curr == row_end - 1 and col_start <= col_curr < col_end - 1:
            rotater.append(arr[row_curr][col_curr])
            col_curr += 1

        # Up after finishing going right
        elif row_start < row_curr < row_end and col_curr == col_end - 1:
            rotater.append(arr[row_curr][col_curr])
            row_curr -= 1

        # Left after finishing going up
        elif row_curr == row_start and col_start < col_curr < col_end:
            rotater.append(arr[row_curr][col_curr])
            col_curr -= 1

    # Rotate list
    try:
        for _ in range(int(r % len(rotater))):
            rotater.appendleft(rotater.pop())
    except:
        pass
    # Save rotated list to answer
    row_curr, col_curr = row_start, col_start

    for _ in range(2 * (row_length + col_length) - 4):

        # Go down from the starting point
        if row_start <= row_curr < row_end - 1 and col_curr == col_start:
            ans[row_curr][col_curr] = rotater.popleft()
            row_curr += 1

        # Right after finishing going down
        elif row_curr == row_end - 1 and col_start <= col_curr < col_end - 1:
            ans[row_curr][col_curr] = rotater.popleft()
            col_curr += 1

        # Up after finishing going right
        elif row_start < row_curr < row_end and col_curr == col_end - 1:
            ans[row_curr][col_curr] = rotater.popleft()
            row_curr -= 1

        # Left after finishing going up
        elif row_curr == row_start and col_start < col_curr < col_end:
            ans[row_curr][col_curr] = rotater.popleft()
            col_curr -= 1

    # Change the starting and ending point
    row_start += 1
    row_end -= 1
    col_start += 1
    col_end -= 1
    row_length -= 2
    col_length -= 2

# Print answer
for r in range(n):
    print(*ans[r])
