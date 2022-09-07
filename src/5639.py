import sys
sys.setrecursionlimit(10 ** 4)

# Graph: stack
tree = []

while True:
    try:
        tree.append(int(sys.stdin.readline()))

    except:
        break


def postorder(start, end):
    if start > end:
        return

    mid = end + 1

    for i in range(start + 1, end + 1):
        if tree[i] > tree[start]:
            mid = i
            break

    postorder(start + 1, mid - 1)
    postorder(mid, end)

    print(tree[start])


postorder(0, len(tree) - 1)