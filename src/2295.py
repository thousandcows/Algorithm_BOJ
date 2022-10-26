N = int(input())

number_list = [int(input()) for _ in range(N)]

ans = 0
for i, num in enumerate(number_list):
    for j, num_two in enumerate(number_list[i + 1:]):
        for k, num_three in enumerate(number_list[j + 1:]):
            target = num + num_two + num_three
            if target in number_list and target > ans:
                ans = target

print(ans)
