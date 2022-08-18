# 노드 객체

class Node:
    def __init__(self, value, left, right):
        self.value = value
        self.left = left
        self.right = right


# 전위 순회: 루트 => 왼 => 오
def preorder(node: Node, sequence: str, node_list: dict) -> str:
    sequence += node.value

    # 기저 조건
    if node.left is None and node.right is None:
        return sequence

    # left node가 있는 경우
    if node.left:
        sequence += preorder(node_list[node.left], '', node_list)
    # right node가 있는 경우
    if node.right:
        sequence += preorder(node_list[node.right], '', node_list)

    # 최종적으로 str를 return
    return sequence

# 중위 순회: 왼 => 루트 => 오
# def inorder(node: Node, sequence: str) -> str:
def inorder(node: Node, sequence: str, node_list: dict) -> str:

    # 기저 조건
    if node.left is None and node.right is None:
        sequence += node.value
        return sequence

    # left node가 있는 경우
    if node.left:
        sequence += inorder(node_list[node.left], '', node_list)

    sequence += node.value

    # right node가 있는 경우
    if node.right:
        sequence += inorder(node_list[node.right], '', node_list)

    # 최종적으로 str를 return
    return sequence

# 후위 순회: 왼 => 오 => 루트
# def postorder(node: Node, sequence: str) -> str:
def postorder(node: Node, sequence: str, node_list: dict) -> str:
    # 기저 조건
    if node.left is None and node.right is None:
        sequence += node.value
        return sequence

    # left node가 있는 경우
    if node.left:
        sequence += postorder(node_list[node.left], '', node_list)

    # right node가 있는 경우
    if node.right:
        sequence += postorder(node_list[node.right], '', node_list)

    sequence += node.value

    # 최종적으로 str를 return
    return sequence
# 입력


# 노드의 개수: N
N = int(input())

# N 줄에 걸쳐 노드 정보를 입력
node_list = {}
for i in range(N):
    value, left, right = input().split(' ')
    node = Node(value, None if left == '.' else left, None if right == '.' else right)
    node_list[value] = node

# 노드 객체 => left와 right를 가진
# 노드 객체에 left, right 속성을 추가한다
# print(node_list[0].left)
preorder_result = preorder(node_list['A'], '', node_list)
inorder_result = inorder(node_list['A'], '', node_list)
postorder_result = postorder(node_list['A'], '', node_list)

# 결과 출력
print(preorder_result)
print(inorder_result)
print(postorder_result)
