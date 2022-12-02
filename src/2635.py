# 1. Read the information
n = int(input())

# 2. Initialize answer variables
answer = ""
max_length = 0

# 3. Bruteforce to find answer
for i in range(n - n // 2, n + 1):

    number_list = [n]

    while i >= 0:
        number_list.append(i)
        i = number_list[-2] - number_list[-1]

    if len(number_list) > max_length:
        answer = " ".join(map(str, number_list))
        max_length = len(number_list)

# 4. Print the answer
print(max_length)
print(answer)
