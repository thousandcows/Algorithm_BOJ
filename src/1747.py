import math

# 1. Read target number 'N'
target_number = int(input())


# 2. Prime number checker
def is_prime_number(number: int) -> bool:
    for i in range(2, int(math.sqrt(number) + 1)):
        if number % i == 0:
            return False
    return True


# 3. Palindrome checker
def is_palindrome(number: str) -> bool:
    return number == number[::-1]


# 3. Print the first prime number that is palindrome
current_number = target_number if target_number != 1 else 2

while True:
    if is_prime_number(current_number) and is_palindrome(str(current_number)):
        break
    current_number += 1

print(current_number)
