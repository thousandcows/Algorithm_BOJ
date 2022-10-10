from collections import Counter

N = int(input())

number_list = [int(input()) for _ in range(N)]
number_list.sort()
print(round(sum(number_list) / N))
print(number_list[N // 2])

counted_result = Counter(number_list).most_common()

if len(counted_result) > 1:
    if counted_result[0][1] == counted_result[1][1]:
        print(counted_result[1][0])
    else:
        print(counted_result[0][0])
else:
    print(counted_result[0][0])
print(number_list[-1] - number_list[0])
