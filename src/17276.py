import sys
from copy import deepcopy

input = sys.stdin.readline


def main():
    test_case = int(input())
    for _ in range(test_case):
        rotate()


def rotate():
    # 1. Read the meta
    n, degree = map(int, input().split())

    times = int(degree // 45) if degree > 0 else int(360 + degree) // 45
    arr = [[int(i) for i in input().split()] for _ in range(n)]

    # 2. Do the rotation
    temp_arr = deepcopy(arr)

    for _ in range(times):
        for r in range(n):
            for c in range(n):
                curr_val = arr[r][c]
                if r == c:
                    temp_arr[r][n // 2] = curr_val
                elif r + c + 1 == n:
                    temp_arr[n // 2][c] = curr_val
                elif r == n // 2:
                    temp_arr[c][c] = curr_val
                elif c == n // 2:
                    temp_arr[r][n - r - 1] = curr_val
        arr = deepcopy(temp_arr)

    # 3. Print the array
    for row in arr:
        print(*row)


if __name__ == "__main__":
    main()
