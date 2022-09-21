import sys

N = int(sys.stdin.readline())

answer = 0
col_set = set()
diag_minus_set = set()
diag_sum_set = set()


def dfs(row, col, count):

    global answer

    # Exit conditions
    if col in col_set:
        return

    diag_dif = row - col
    diag_sum = row + col

    if diag_dif in diag_minus_set:
        return
    if diag_sum in diag_sum_set:
        return

    if count == N:
        answer += 1
        return

    # Duplicate sets
    col_set.add(col)
    diag_sum_set.add(diag_sum)
    diag_minus_set.add(diag_dif)

    # Process
    for i in range(N):
        dfs(row + 1, i, count + 1)

    # Duplicated sets pop
    col_set.remove(col)
    diag_sum_set.remove(diag_sum)
    diag_minus_set.remove(diag_dif)


for i in range(N):
    dfs(0, i, 1)

sys.stdout.write(str(answer))
