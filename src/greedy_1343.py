board = input()


def paint_board(cnt: int) -> str:
    a_to_add, b_to_add = "", ""
    if cnt >= 4:
        a_to_add = 'AAAA' * int(cnt // 4)
        cnt %= 4

    if cnt > 1:
        b_to_add = 'BB' * int(cnt // 2)

    return a_to_add + b_to_add


def main():
    answer = ""
    count = 0

    for ch in board:

        if ch == '.':
            if count == 0:
                answer += ch
                continue
            elif count % 2 == 0:
                answer += paint_board(count) + ch
                count = 0

                continue
            print(-1)
            exit()

        elif ch == 'X':
            count += 1

    if count % 2 == 0:
        answer += paint_board(count)
    elif count != 0:
        answer = -1

    print(answer)


if __name__ == "__main__":
    main()
