N = int(input())

fibonacci_list = [0 for _ in range(N + 1)]

fibonacci_list[0] = 0
fibonacci_list[1] = 1


for i in range(2, N + 1):
    fibonacci_list[i] = fibonacci_list[i - 1] + fibonacci_list[i - 2]

print(fibonacci_list[N])
