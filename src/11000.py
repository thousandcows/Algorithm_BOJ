import sys, heapq

# Input data
N = int(sys.stdin.readline())
class_list = list(list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(N))

# Sort class_list
class_list.sort(key=lambda x: x[0])

# Find the minimum number of classes
room = []
heapq.heappush(room, class_list[0][1])

for i in range(1, N):

    curr_class = class_list[i]

    if room[0] > curr_class[0]:
        heapq.heappush(room, class_list[i][1])
    else:
        heapq.heappop(room)
        heapq.heappush(room, curr_class[1])

print(len(room))
