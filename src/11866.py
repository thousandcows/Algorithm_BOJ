def josephus_sequence(n, k):
    # 사용할 queue
    q = []

    for i in range(n):
        q.append(i + 1)

    print('<', end='')

    # K를 count할 변수
    count = 1

    # Queue가 빌 때 까지 수행한다
    while q:
        if count == k:
            print(q[0], end='')
            del q[0]
            count = 1
            if q:
                print(', ', end='')
        else:
            q.append(q[0])
            del q[0]
            count += 1

    print('>', end='')

n, k = map(int, input().split(' '))

josephus_sequence(n, k)  # [3, 6, 2, 7, 5, 1, 4]이 반환되어야 합니다
