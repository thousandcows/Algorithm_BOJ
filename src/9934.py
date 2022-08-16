# 트리를 재귀적으로 찾는 함수
def find_tree(tree: list, level: int, record: list):

    # 종료 조건: 리프에 도달하는 경우
    if len(tree) <= 2:
        record[level].append(tree[0])
        return

    # 이용될 변수: 중간점
    middle = int(len(tree) / 2)

    # 해당 트리의 루트 노드
    center = tree[middle]
    record[level].append(center)

    level += 1

    # 해당 노드의 왼쪽 자식 탐색
    left_tree = tree[:middle]
    find_tree(left_tree, level, record)
    # 해당 노드의 오른쪽 자식 탐색
    right_tree = tree[middle + 1:]
    find_tree(right_tree, level, record)

    return record


# 입력
K = int(input())
tree = list(map(int, input().split(" ")))

# 층 수: level
level = 0

# 층 마다 기록할 배열
record = [[] for i in range(K)]

# 결과 출력
result = find_tree(tree, level, record)
for r in result:
    for i in r:
        print(i, end=" ")
    print()