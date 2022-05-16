# 1. 문제를 정확히 이해하기 => 첫 구현문제

# 논리적 사고력: 학생들의 만족도 총 합을 구한다

# 만족도: 자신을 기준으로 상, 하, 좌, 우 4 곳 중 좋아하는 학생 수 0, 1, 2, 10, 1000

# 2. 문제 해결을 위한 알고리즘 개발하기

# 필요한 것
# 교실을 담을 2차원 배열
# 실시간으로 평가할 수 있는 배열 => 학생이 바뀔 때마다 초기화
# 학생 마다 좋아하는 학생 번호를 담을 배열

# evaluation = [[]]

# 1. 비어 있을 때: 첫 번째 학생은 2, 2 에 위치한다.
# classroom[2][2] = student

# 2. 그 다음부터 아래의 규칙을 적용한다.

#
#   for i in range(row):
#       for j in range(col):
#           if classroom[row][col] == 0:
#               evaluate() => d_row = [1, -1, 0, 0], d_col = [0, 0, 1, -1]
#                               for i in range(4):
#                                   for student in students: => 제약조건 추가 : 교실의 범위 안에 있어야 함
#
#                                       a. 빈 칸들 중에서 좋아하는 학생이 가장 많이 인접한 곳으로 배치한다
#                                       if classroom[nrow][ncol] == student:
#                                           evaluation[row][col] += 2
#
#                                       b. a을 만족하는 칸이 여러 개인 경우 => 인접한 칸 중 비어 있는 칸이 가장 많은 곳으로 자리를 정한다.
#                                       elif classroom[nrow][ncol] == 0:
#                                           evaluation[row][col] += 1
#
#   배치 전략
#   각 행 별로 max 값을 추출한다
#   전체 max 값을 추출한다.
#   처음부터 evaluation array를 돌면서 처음 max 값이 나오는 index[row][col]을 반환한다. => 동시에 evaluation을 초기화한다.
#   classroom[row][col] = student

#

#   c. b를 만족하는 칸이 여러 개인 경우 => 행의 번호 => 열의 번호가 작은 순으로 배치한다.

# 3. 교실이 모두 차면 만족도를 평가한다.


# 3. 알고리즘이 문제를 해결할 수 있다는 것을 증명한다

# 4. 알고리즘이 제한 시간, 공간 안에 풀린다는 것을 증명한다

# 5. 코드로 구현한다 => 만점을 받고 기뻐한다.

