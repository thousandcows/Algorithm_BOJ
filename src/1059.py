def main():
    # 1. Read information
    set_size = int(input())
    number_set = list(int(i) for i in input().split())
    target = int(input())

    # 2. Exit condition
    if target in number_set:
        return 0

    # 2. Append n to the number_set and sort
    number_set.append(target)
    number_set.sort()

    # 3. Find the possible range of numbers
    index_of_target = number_set.index(target)

    # 4. Calculate the answer
    if index_of_target == 0:
        end_number = number_set[1]
        return target * (end_number - target) - 1

    elif 0 < index_of_target < set_size:
        start_number = number_set[index_of_target - 1]
        end_number = number_set[index_of_target + 1]
        return (target - start_number) * (end_number - target) - 1


if __name__ == '__main__':
    print(main())
