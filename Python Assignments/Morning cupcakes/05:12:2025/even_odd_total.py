#Morning cupcake 2

#Write a program that asks for input 20 times and prints the sums of the even and odd numbers 

run_time = 1
even_total = 0
even_count = 0
odd_total = 0
odd_count = 0

for run_time in range (1, 21): 	
#while run_time <= 20:
	user_number_input = int(input(f"Enter an integer {run_time}: "))
	if user_number_input % 2 == 0:
		even_total += user_number_input
		even_count += 1
	else:  
		odd_total += user_number_input
		odd_count += 1
	run_time += 1

print("The sum of the Even numbers is: ", even_total)
print("The sum of the Odd numbers is: ", odd_total)
print("The total number of the Even numbers is: ", even_count)
print("The total number of the Odd numbers is: ", odd_count)