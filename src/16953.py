A, B = map(int, input().split())

minimum_count = B + 1


# Function to find minimum count
def dfs(start: int, count: int):
    global minimum_count

    # Exit condition
    if start > B:
        return

    if count >= minimum_count:
        return

    # Condition to change minimum count
    if start == B and count < minimum_count:
        minimum_count = count

    # Continue dfs if B has not been made
    dfs(start * 2, count + 1)
    dfs(int(str(start) + '1'), count + 1)


dfs(A, 0)

print(minimum_count + 1 if minimum_count < B + 1 else -1)
