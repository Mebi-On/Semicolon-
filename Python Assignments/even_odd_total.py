run_time = 0
even_total = 0
odd_total = 0

for run_time <= 20:
	user_number_input = int(input("Enter an integer"))
	if user_number_input % 2 == 0:
		even_total += user_number_input
	else: 
		odd_total += user_number_input
print("The sum of the Even numbers is: ", even_total)
print("The sum of the Odd numbers is: ", odd_total)