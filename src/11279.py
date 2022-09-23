import sys, heapq

N = int(sys.stdin.readline())

q = []

for _ in range(N):
    num = int(sys.stdin.readline())
    if num == 0:
        if len(q) == 0:
            print(0)
        else:
            print(-1 * heapq.heappop(q))
    else:
        heapq.heappush(q, -num)

