N = int(input())
egg_life = []
egg_weight = []

for _ in range(N):
    s, w = map(int, input().split())
    egg_life.append(s)
    egg_weight.append(w)

ans = 0


def dfs(index: int, count: int) -> None:
    global ans

    # Exit condition: no more eggs to hit
    if index == N:
        ans = max(ans, count)
        return

    # If the egg is not broken
    if egg_life[index] > 0:
        flag = True  # Flag to tell if all eggs is broken except a holding egg
        for idx in range(N):
            # Pass the same index or if the egg is already broken

            if idx == index or egg_life[idx] <= 0:
                continue

            flag = False

            # Hit the egg
            egg_life[idx] -= egg_weight[index]
            egg_life[index] -= egg_weight[idx]

            # Count broken eggs
            count_to_add = 1
            if egg_life[idx] <= 0 and egg_life[index] <= 0:
                count_to_add = 2
            elif egg_life[idx] > 0 and egg_life[index] > 0:
                count_to_add = 0
            # DFS
            dfs(index + 1, count + count_to_add)

            # Recover the egg record
            egg_life[idx] += egg_weight[index]
            egg_life[index] += egg_weight[idx]

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