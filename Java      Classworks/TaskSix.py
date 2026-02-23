

user_input = input("Enter number: ")

if len(user_input) == 4:

	output = float(user_input) * 100
	print(int(output), end ="%\n") 
elif user_input[-1] == "0" :

	output = float(user_input) * 100
	print(int(output), end ="%\n") 
else:

	output = float(user_input) * 100
	print(output, end ="%\n") 

