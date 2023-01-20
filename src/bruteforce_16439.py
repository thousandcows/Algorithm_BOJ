import sys
from itertools import combinations


def main():
    input = sys.stdin.readline
    members, chickens = map(int, input().split())
    members_satisfaction_list = [list(map(int, input().split())) for _ in range(members)]
    chicken_list = [i for i in range(0, chickens)]

    ans = 0
    for count in range(1, 4):
        combination = combinations(chicken_list, count)

        for case in combination:
            curr_sum = 0

            for member in members_satisfaction_list:
                curr_sum += max([member[idx] for idx in case])

            if curr_sum > ans:
                ans = curr_sum

    print(ans)


if __name__ == "__main__":
    main()
