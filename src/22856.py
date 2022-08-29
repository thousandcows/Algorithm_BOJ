import sys
sys.setrecursionlimit(100000)

class Node:
    def __init__(self, value, left, right):
        self.value = value
        self.left = left
        self.right = right

# inorder
def inorder(node):
    if node.left != -1:
        inorder(nodes[node.left])

    inorder_list.append(node.value)

    if node.right != -1:
        inorder(nodes[node.right])

# like_inorder
def like_inorder(node):

    global cnt

    if node.left != -1:
        like_inorder(nodes[node.left])
        cnt += 1

    if node.value == inorder_list[-1]:
        print(cnt)
        return
    cnt += 1

    if node.right != -1:
        like_inorder(nodes[node.right])
        cnt += 1

# Input
N = int(input())

nodes = {}
for i in range(N):
    v, l, r = map(int, input().split(' '))
    nodes[v] = Node(v, l, r)

# Output
cnt = 0
inorder_list = []
inorder(nodes[1])
like_inorder(nodes[1])