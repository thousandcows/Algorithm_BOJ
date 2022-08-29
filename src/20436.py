# Input

sl, sr = input().split(' ')
word = input()

# Default answer value
answer = len(word)

# Keyboard information
keyboard = {
    'q': (0, 0, 0),
    'w': (0, 1, 0),
    'e': (0, 2, 0),
    'r': (0, 3, 0),
    't': (0, 4, 0),
    'y': (0, 5, 1),
    'u': (0, 6, 1),
    'i': (0, 7, 1),
    'o': (0, 8, 1),
    'p': (0, 9, 1),
    'a': (1, 0, 0),
    's': (1, 1, 0),
    'd': (1, 2, 0),
    'f': (1, 3, 0),
    'g': (1, 4, 0),
    'h': (1, 5, 1),
    'j': (1, 6, 1),
    'k': (1, 7, 1),
    'l': (1, 8, 1),
    'z': (2, 0, 0),
    'x': (2, 1, 0),
    'c': (2, 2, 0),
    'v': (2, 3, 0),
    'b': (2, 4, 1),
    'n': (2, 5, 1),
    'm': (2, 6, 1)
}

for w in word:
    # 왼쪽인지 오른쪽인지 판단
    location = keyboard[w][2]
    # 왼쪽인 경우
    if location == 0:
        answer += (abs(keyboard[sl][0] - keyboard[w][0]) + abs(keyboard[sl][1] - keyboard[w][1]))
        sl = w
    # 오른쪽인 경우
    else:
        answer += (abs(keyboard[sr][0] - keyboard[w][0]) + abs(keyboard[sr][1] - keyboard[w][1]))
        sr = w

print(answer)
