def is_power_of_two(n):
	if (n & (n-1) == 0):
		print n

for i in range(1,1000):
	is_power_of_two(i)