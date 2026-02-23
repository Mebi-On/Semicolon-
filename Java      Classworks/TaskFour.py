
for num in range (100, 201):
	if num % 4 == 0:
		if num % 6 == 0:
			print('"Hello World"')
		else: 
			print('"Hello"')
	elif num % 6 == 0:
		print('"World"')
	else:
		print(num)
	