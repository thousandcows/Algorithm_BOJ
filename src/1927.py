import sys, heapq

N = int(sys.stdin.readline())

q = []

for _ in range(N):
    order = int(sys.stdin.readline())
    if order == 0:
        if len(q) == 0:
            print(0)
        else:
            print(heapq.heappop(q))
    else:
        heapq.heappush(q, order)