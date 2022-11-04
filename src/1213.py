name = input()
name_dict = dict()


# Is Palindrome Possible?
def is_palindrome_possible(dict: name_dict) -> str:
    count = 0
    odd_alphabet = ''
    for a in name_dict:
        if name_dict[a] % 2 != 0:
            count += 1
            odd_alphabet = a

        if count > 1:
            odd_alphabet = "I'm Sorry Hansoo"

    return odd_alphabet


# Split name and put into dict
for w in name:
    if w in name_dict:
        name_dict[w] += 1
    else:
        name_dict[w] = 1

# Validation: is palindrome possible
result = is_palindrome_possible(name_dict)

# Main logic
# Not possible
if len(result) > 1:  # If more than two alphabets' count is odd: not possible
    print("I'm Sorry Hansoo")
# Possible
else:
    ans = ""
    if result:  # If the odd count alphabet exists: set that alphabet as center
        ans = result
        name_dict[result] -= 1

    # Make list of keys and sort it in reverse
    key_list = sorted(list(name_dict.keys()), reverse=True)

    # Make palindrome that matches the condition
    for key in key_list:
        for _ in range(name_dict[key] // 2):
            ans = key + ans + key

    print(ans)
