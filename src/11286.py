import sys
import heapq

N = int(sys.stdin.readline())

q = []
answer = []
for _ in range(N):
    num = int(sys.stdin.readline())
    if num == 0:
        if len(q) == 0:
            answer.append(0)
        else:
            answer.append(heapq.heappop(q)[1])
    else:
        heapq.heappush(q, [abs(num), num])

print('\n'.join(map(str, answer)))