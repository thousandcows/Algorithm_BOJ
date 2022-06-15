# 1. 녹음한 소리 읽기
duck_sound = input()

# 2. 오리의 최소 수 구하기
duck_count = 0
quack = ['q', 'u', 'a', 'c', 'k']
visited = [False] * len(duck_sound)

# 문장의 길이가 5로 나누어 떨어지지 않거나, q 외의 문자로 시작하는 경우
if len(duck_sound) % 5 != 0:
    print(-1)
    exit()


# 위 조건을 통과하는 경우
def solve(start):
    global duck_count
    quack_idx = 0
    first = True
    for i in range(start, len(duck_sound)):
        if duck_sound[i] == quack[quack_idx] and not visited[i]:
            visited[i] = True
            if duck_sound[i] == 'k':
                if first:
                    duck_count += 1
                    first = False
                quack_idx = 0
                continue
            quack_idx += 1


for i in range(len(duck_sound)):
    if duck_sound[i] == 'q' and not visited[i]:
        solve(i)

if not all(visited) or duck_count == 0:
    print(-1)
else:
    print(duck_count)
