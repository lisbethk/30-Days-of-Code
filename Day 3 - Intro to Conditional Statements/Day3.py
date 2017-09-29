import sys


N = int(input())

if N % 2 != 0:
    print("Not Weird")
else:
    if N <= 5:
        print("Weird")
    elif N <= 20:
        print("Not Weird")
    else:
        print("Weird")