import sys
from typing import List

height, width = map(int, sys.stdin.readline().split())
blocks = list(map(int, sys.stdin.readline().split()))


def calculate_water(water_blocks: List[int]) -> int:
    if not water_blocks:
        return 0

    volume = 0  # variable to store water count
    left, right = 0, len(water_blocks) - 1  # two pointers to move
    left_max, right_max = water_blocks[left], water_blocks[right]

    while left < right:
        left_max = max(water_blocks[left], left_max)
        right_max = max(water_blocks[right], right_max)

        if left_max <= right_max:
            volume += left_max - water_blocks[left]
            left += 1
        else:
            volume += right_max - water_blocks[right]
            right -= 1

    return volume


print(calculate_water(blocks))
