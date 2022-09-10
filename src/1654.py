# Input
import sys

K, N = map(int, sys.stdin.readline().split())

lan_list = []

for _ in range(K):
    lan_list.append(int(sys.stdin.readline()))

# Find max_length
max_length = -1
start = 1
end = max(lan_list)

while start <= end:
    mid = (start + end) // 2

    total = 0
    for lan in lan_list:
        total += lan // mid

    if total >= N:
        if mid > max_length:
            max_length = mid
        start = mid + 1
        end = end
    else:
        start = start
        end = mid - 1

# Output
print(max_length)
