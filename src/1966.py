import sys
from collections import deque

# Read test case
test_case = int(sys.stdin.readline().rstrip())

# Use deque and list
queue = deque()
importance_list = list()

# Calculate each test case
for _ in range(test_case):
    number_of_documents, target_document = map(int, sys.stdin.readline().rstrip().split())
    document_list = map(int, sys.stdin.readline().rstrip().split())

    for index, importance in enumerate(document_list):
        queue.append(index)
        importance_list.append(importance)

    count = 0
    top_priority = max(importance_list)
    while True:

        curr_document = queue.popleft()

        # In case that current document matches the top priotiry
        if importance_list[curr_document] == top_priority:

            count += 1
            # If the document is the target
            if curr_document == target_document:
                print(count)
                queue.clear()
                importance_list.clear()
                break
            # Not a target: just pop
            else:
                importance_list[curr_document] = -1
                top_priority = max(importance_list)
        # Append unmatched current document to the back of the queue
        else:
            queue.append(curr_document)


