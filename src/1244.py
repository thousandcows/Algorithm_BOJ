# Input
N = int(input())
switches = list(map(int, input().split(' ')))

students = int(input())

# Change Switches
for i in range(students):
    s, n = map(int, input().split(' '))

    # 1. 남자인 경우: n의 배수인 모든 수의 상태에 +1 해준다
    if s == 1:
        for j in range(len(switches)):
            if (j + 1) % n == 0:
                switches[j] += 1

    # 2. 여자인 경우:
    else:
        extend = 1

        switches[n - 1] += 1

        while (n - 1 - extend) >= 0 and (n - 1 + extend) < len(switches):

            if switches[n - 1 - extend] % 2 == switches[n - 1 + extend] % 2:
                switches[n - 1 - extend] += 1
                switches[n - 1 + extend] += 1
                extend += 1

            else:
                break

# Output
cnt = 0
for s in switches:
    print(1 if s % 2 == 1 else 0, end=' ')
    cnt += 1
    if cnt % 20 == 0:
        print()