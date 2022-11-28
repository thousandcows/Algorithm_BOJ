import math

# 1. Read target number 'N'
target_number = int(input())

# 2. Generate prime number list
prime_number_list = [1, 1] + [0] * 1003000

for number in range(2, int(math.sqrt(1003001)) + 1):
    if prime_number_list[number] == 0:
        multiplier = 2
        while number * multiplier <= 1003001:
            prime_number_list[number * multiplier] = 1
            multiplier += 1


# 3. Palindrome checker
def is_palindrome(number: int) -> bool:
    str_number = str(number)
    for i in range(len(str_number) // 2):
        if str_number[i] != str_number[-i - 1]:
            return False
    return True


# 3. Print the first prime number that is palindrome
for i in range(target_number, 1003002):
    if prime_number_list[i] == 1:
        continue
    if is_palindrome(i):
        print(i)
        break
