#!/bin/python3

import sys


q = int(input().strip())
for a0 in range(q):
    x = int(input().strip())
    binary = list(bin(x))[2:]
    binary.reverse()
    summ = 0
    for idx, item in enumerate(binary):
        if item == "0":
            summ += 2**idx

    print(summ)
