while(True):
    # 1. Read num1, num2 and split
    num1, num2 = input().split(' ')

    # 2. Change string type to integer
    num1 = int(num1)
    num2 = int(num2)

    # 3. break condition
    if num1 == num2 == 0:
        break;

    # 4. if-else statement to define relation
    relation = ''
    if num2 % num1 == 0:
        relation = 'factor'
    elif num1 % num2 == 0:
        relation = 'multiple'
    else:
        relation = 'neither'

    print(relation)