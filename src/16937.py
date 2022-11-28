import sys

read = sys.stdin.readline

# 1. Read information
height, width = map(int, read().split())
number_of_stickers = int(read())

# 2. Save height, width, coverage of each sticker
sticker_list = list(list(map(int, read().split())) for _ in range(number_of_stickers))
# 3. Find the maximum coverage
result = 0

for first_index in range(len(sticker_list)):
    for second_index in range(first_index + 1, len(sticker_list)):

        first_height, first_width = sticker_list[first_index]
        second_height, second_width = sticker_list[second_index]

        current_result = first_width * first_height + second_width * second_height

        if (first_height + second_height <= height and max(first_width, second_width) <= width) or (
                max(first_height, second_height) <= height and first_width + second_width <= width):
            result = max(result, current_result)

        if (first_width + second_width <= height and max(first_height, second_height) <= width) or (
                max(first_width, second_width) <= height and first_height + second_height <= width):
            result = max(result, current_result)

        if (first_height + second_width <= height and max(first_width, second_height) <= width) or (
                max(first_height, second_width) <= height and first_width + second_height <= width):
            result = max(result, current_result)

        if (first_width + second_height <= height and max(first_height, second_width) <= width) or (
                max(first_width, second_height) <= height and first_height + second_width <= width):
            result = max(result, current_result)

# 4. Print the answer
print(result)
