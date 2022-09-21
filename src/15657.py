import itertools
import sys

N, M = map(int, sys.stdin.readline().split())
numbers = sorted(list(map(int, sys.stdin.readline().split())))

sys.stdout.write(
    '\n'.join(map(lambda x: ' '.join(map(str, x)), itertools.combinations_with_replacement(sorted(numbers), M))))
