# Input
N = int(input())
star_array = [[' ' for i in range(4 * (N - 1) + 1)] for j in range(4 * (N - 1) + 1)]

def get_stars(n, x, y):

    # 종료 조건: 남은 길이가 1일 때
    if n == 1:
        star_array[x][y] = '*'
        return

    # 1이 아닌 경우
    square_length = 4 * (n - 1) + 1

    # x, y 좌표에서 시작해서 [x][y] 반복문: length 열 만큼 돌아야지? 4 * (n - 1) + 1 행, 4 * (n - 1) + 1 열 만큼
    for i in range(square_length):
        star_array[y][x + i] = '*'  # 1행 전체열
        star_array[y + i][x] = '*'  # n행 맨 왼쪽
        star_array[y + i][x + square_length - 1] = '*'  # n행 맨 오른 쪽
        star_array[y + square_length - 1][x + i] = '*'  # 마지막 행 전체 열


    get_stars(n - 1 , x + 2, y + 2)


# Output
get_stars(N, 0, 0)

for s in star_array:
    print(''.join(s))
