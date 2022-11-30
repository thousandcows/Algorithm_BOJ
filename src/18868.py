import sys

read = sys.stdin.readline

universe_numbers, planet_numbers = map(int, read().split())
space_list = [list(int(planet) for planet in read().split()) for _ in range(universe_numbers)]

count = 0


def is_equal(first_idx, second_idx):
    for i in range(planet_numbers):
        for j in range(planet_numbers):

            if i == j:
                continue

            if space_list[first_idx][i] > space_list[first_idx][j]:
                if space_list[second_idx][i] <= space_list[second_idx][j]:
                    return False
            elif space_list[first_idx][i] < space_list[first_idx][j]:
                if space_list[second_idx][i] >= space_list[second_idx][j]:
                    return False
            else:
                if space_list[second_idx][i] != space_list[second_idx][j]:
                    return False
    return True


for first_idx in range(len(space_list) - 1):
    for second_idx in range(first_idx + 1, len(space_list)):
        if is_equal(first_idx, second_idx):
            count += 1

print(count)
