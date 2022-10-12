numbers, length = map(int, input().split())

# Input information
dna_list = list()
for _ in range(numbers):
    dna_list.append(input())

# Answer variables
s = ""
min_distance = 0

# Search each column to find minimum distance
for i in range(length):
    dict_to_count = [0, 0, 0, 0]    # A, C, G, T

    # Search each dna's index by column
    for dna in dna_list:
        if dna[i] == 'A':
            dict_to_count[0] += 1
        elif dna[i] == 'C':
            dict_to_count[1] += 1
        elif dna[i] == 'G':
            dict_to_count[2] += 1
        else:
            dict_to_count[3] += 1

    # Find maximum count, word for minimum distance
    result = max(dict_to_count)
    index = dict_to_count.index(result)

    if index == 0:
        s += 'A'
    elif index == 1:
        s += 'C'
    elif index == 2:
        s += 'G'
    else:
        s += 'T'

    min_distance += numbers - result

# Print answer
print(s + '\n' + str(min_distance))