"""
Problem: Write a program that prints out all powers of two from 1 to 1000.
"""

def is_power_of_two(n):
    """ Prints n if n is a power of two """"
    if (n & (n-1) == 0):
        print n

for i in range(1,1000):
    is_power_of_two(i)