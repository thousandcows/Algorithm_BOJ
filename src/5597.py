# 1. Initialize a list of students
students = [0 for i in range(31)]

# 2. Check the assignments
for _ in range(28):
    submitted = int(input())
    students[submitted] = 1

# 3. Print students not submited
for i in range(1, len(students)):
    if students[i] == 0:
        print(i)
