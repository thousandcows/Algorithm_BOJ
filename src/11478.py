s = input()
string_length = len(s)

print(sum(len(set(s[start:start + end] for start in range(string_length - end + 1))) for end in range(1, string_length + 1)))
