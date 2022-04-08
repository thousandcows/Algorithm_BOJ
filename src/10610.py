N = list(input())

answer = -1

max_num = sorted(N, reverse=True)

max_num = int(''.join(max_num))

if max_num % 30 == 0:
    answer = max_num

print(answer)