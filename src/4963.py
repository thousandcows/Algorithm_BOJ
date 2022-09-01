import sys
sys.setrecursionlimit(10000)
def find_islands():



    while True:
        w, h = map(int, input().split())
        # Stop the loop
        if w == 0 and h == 0:
            break
        # Initialize map list
        map_info = []
        visited = [[False for _ in range(w)] for _ in range(h)]
        # Add map information
        for i in range(h):
            map_info.append(list(map(int, input().split())))

        # Count the number of islands
        count = 0

        def count_islands(k, j):

            visited[j][k] = True

            directions = [(0, -1), (0, 1), (-1, 0), (1, 0), (-1, -1), (1, -1), (-1, 1), (1, 1)]

            for d in directions:
                nx = k + d[0]
                ny = j + d[1]
                if 0 <= nx < w and 0 <= ny < h:
                    if not visited[ny][nx] and map_info[ny][nx] == 1:
                        count_islands(nx, ny)

        for j in range(h):
            for k in range(w):
                if not visited[j][k] and map_info[j][k] == 1:
                    count += 1
                    count_islands(k, j)

        # print count
        print(count)
find_islands()