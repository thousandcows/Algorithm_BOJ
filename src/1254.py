string = list(input())

palindrome = string[::-1]

ans = len(string) * 2

# Brute force to find answer
for i in range(len(palindrome)):

    # Delete characters from the front
    case_one = string + palindrome[i:]

    if case_one == case_one[::-1]:
        ans = min(ans, len(case_one))

    # Delete characters from the back
    case_two = string + palindrome[:-i]

    if case_two == case_two[::-1]:
        ans = min(ans, len(case_two))

# Print answer
print(ans)
