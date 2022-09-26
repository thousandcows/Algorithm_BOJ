import itertools
import sys

equation = list(sys.stdin.readline().rstrip())
answers = set()
stack = []
paren_info = []

for idx, num in enumerate(equation):
    if num == '(':
        stack.append(idx)
    elif num == ')':
        paren_info.append((stack.pop(), idx))

for i in range(1, len(paren_info) + 1):
    cases = itertools.combinations(paren_info, i)

    for case in cases:
        equation_to_delete = list(equation)

        for p in case:
            equation_to_delete[p[0]] = ""
            equation_to_delete[p[1]] = ""

        answers.add(''.join(equation_to_delete))

for w in sorted(list(answers)):
    print(w)
