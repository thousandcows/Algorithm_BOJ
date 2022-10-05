from collections import deque
# Read the number
N = int(input())

# Initialize deque
q = deque()

# Insert numbers in a reverse order
for i in range(N):
    q.appendleft(i + 1)

# Do the procedure until the deque has only one element
while len(q) > 1:
    q.pop()
    top = q.pop()
    q.appendleft(top)

# Print answer
print(q[0])
