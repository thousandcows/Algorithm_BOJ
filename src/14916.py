# 거스름돈을 넘겨주는 함수
def coin_change(n):

    num = n // 5

    # 5로 나눈 몫을 기준으로 해서 최소 개수를 구한다
    for i in range(num, -1, -1):

        fives = i * 5
        money = n - fives

        if money == 0:
            return i

        if money % 2 == 0:
            return i + (money // 2)

    return -1


# 입력 n: 거스름돈 수
n = int(input())

# 출력: 동전의 최소 개수
print(coin_change(n))