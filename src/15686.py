import sys
from itertools import combinations

input = sys.stdin.readline


# Function that returns the distance
def get_distance(house_location: tuple[int, int], store_location: tuple[int, int]) -> int:
    return abs(house_location[0] - store_location[0]) + abs(house_location[1] - store_location[1])


# Read the delivery information
city_size, number_of_chicken_store = map(int, input().split())

house_location_info = list()  # list to store house_location_info
chicken_location_info = list()  # list to store store_location_information

# Store data of house and chicken store
row_number = 0

for row_number in range(city_size):
    curr_row = map(int, input().split())

    for col_number, val in enumerate(curr_row):
        if val == 1:
            house_location_info.append((row_number, col_number))
        elif val == 2:
            chicken_location_info.append((row_number, col_number))

# Find the minimum distance sum
ans = sys.maxsize

for store_combination in list(combinations(chicken_location_info, number_of_chicken_store)):
    curr_ans = 0
    curr_dist = sys.maxsize

    for house in house_location_info:
        min_dist_from_home_to_store = sys.maxsize
        for store in store_combination:
            min_dist_from_home_to_store = min(min_dist_from_home_to_store, get_distance(house, store))
        curr_ans += min_dist_from_home_to_store
    if curr_ans < ans:
        ans = curr_ans

# Print answer
print(ans)
