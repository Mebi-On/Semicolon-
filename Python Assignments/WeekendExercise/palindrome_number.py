def palindrome_number(user_input):
    reversed_string = ""

    for index in range(len(user_input)):
        reversed_string += user_input[- index + len(user_input) - 1]
	
    if user_input.isdigit(): 
        user_input = int(user_input)
        reversed_string = int(user_input)

        if user_input == reversed_string:
            print("The number is a palindrome")
        else:
            print("The number is NOT a palindrome")
    else:
        print("Not an Integer")


user_input = input("Enter a number to check palindrome: ")
palindrome_number(user_input)