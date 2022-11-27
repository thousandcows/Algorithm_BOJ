from itertools import product

target_number, size_of_union = map(int, input().split())
number_union = list(input().split())

answer_list = []

for number_length in range(len(str(target_number)), 0, -1):
    result_list = list(product(number_union, repeat=number_length))

    for case in result_list:
        curr_number = int(''.join(case))
        if curr_number <= target_number:
            answer_list.append(curr_number)

    if len(answer_list) > 0:
        break

print(max(answer_list))
