import sys
train_length, orders = map(int, sys.stdin.readline().split())

train_list = ['00000000000000000000' for _ in range(train_length)]

for _ in range(orders):
    case_num, *order = list(map(int, sys.stdin.readline().split()))

    if case_num == 1 or case_num == 2:
        train, seat = order
        new_str = ''
        for i in range(len(train_list[train - 1])):
            if i == seat - 1:
                new_str += '1' if case_num == 1 else '0'
            else:
                new_str += train_list[train - 1][i:i + 1]
        train_list[train - 1] = new_str
    else:
        train = order
        train_list[train - 1] = '0' + train_list[train - 1][:-1] if case_num == 3 else train_list[train - 1][1:] + '0'


print(len(set(train_list)))
