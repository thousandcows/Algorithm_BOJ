import sys

# Read test case
test_case = int(sys.stdin.readline().strip())

# Calculate each test case
for _ in range(test_case):
    number_of_documents, target_document = map(int, sys.stdin.readline().strip().split())
    document_list = list(map(int, sys.stdin.readline().strip().split()))

    idx, top_priority, count, last = 0, max(document_list), 0, number_of_documents - 1
    visited = [False] * number_of_documents

    while True:

        # In case that current document matches the top priotiry
        if not visited[idx] and document_list[idx] == top_priority:
            visited[idx] = True
            count += 1
            last = idx

            # If the target matches
            if idx == target_document:
                print(count)
                break

        # Doesn't match, and searched all index without matching current top priority
        elif idx == last:
            top_priority -= 1

        idx = (idx + 1) % number_of_documents   # Divide by the number of documents like queue works
