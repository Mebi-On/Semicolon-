
message = "Enter the number of integers to be used: " 
message_2 = "Enter your numbers: "
number_of_inputs = int(input(message))
count = 0
even_sum = 0
odd_sum =0

while count < number_of_inputs:
	numbers = int(input(message_2))
	count += 1
	if numbers % 2 == 0:
		even_sum += numbers
	else:
		odd_sum += numbers
print("The sum of the even numbers is ", even_sum)
print("The sum of the odd numbers is", odd_sum)