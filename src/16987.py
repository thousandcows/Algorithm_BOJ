N = int(input())
egg_list = [list(map(int, input().split())) for _ in range(N)]

ans = 0


def dfs(index: int, count: int) -> None:
    global ans

    # Exit condition: no more eggs to hit
    if index == N:
        ans = max(ans, count)
        return

    # If the egg is not broken
    if egg_list[index][0] > 0:
        flag = True  # Flag to tell if all eggs is broken except a holding egg
        for idx in range(N):
            # Pass the same index or if the egg is already broken

            if idx == index or egg_list[idx][0] <= 0:
                continue

            flag = False

            # Hit the egg
            egg_list[idx][0] -= egg_list[index][1]
            egg_list[index][0] -= egg_list[idx][1]

            # Count broken eggs
            count_to_add = 1
            if egg_list[idx][0] <= 0 and egg_list[index][0] <= 0:
                count_to_add = 2
            elif egg_list[idx][0] > 0 and egg_list[index][0] > 0:
                count_to_add = 0
            # DFS
            dfs(index + 1, count + count_to_add)

            # Recover the egg record
            egg_list[idx][0] += egg_list[index][1]
            egg_list[index][0] += egg_list[idx][1]

        if flag:
            ans = max(ans, N - 1)
            return
    # If the egg is broken
    else:
        dfs(index + 1, count)
        return


# Print answer
dfs(0, 0)
print(ans)