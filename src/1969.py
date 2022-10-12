import sys

inputs = sys.stdin.read().splitlines()

numbers, length = map(int, inputs[0].split())

# Input information
dna_list = list(dna for dna in inputs[1:])

# Answer variables
s = ""
min_distance = 0
word_to_add = ['A', 'C', 'G', 'T']

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

    s += word_to_add[index]
    min_distance += numbers - result

# Print answer
print(s + '\n' + str(min_distance))