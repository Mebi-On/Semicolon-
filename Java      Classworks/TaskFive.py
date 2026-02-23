
user_input = input("Enter a number: ")



count = 0
for numbers in user_input:
	count += 1


comma = count % 3 
commas = count // 3 
counted =0 
if count < 4:
	print(f"${user_input}") 
else:
	for numbers in user_input:
		counted += 1
		print(numbers, end = "")
		if(counted == comma):
			print(",", end = "")
		if((counted + 1)/3 == 2):
			if (counted != count):
				print(",", end = "")
		