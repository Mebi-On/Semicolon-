def reverse_string(user_input):
	
    for index in range(len(user_input)):
        print(user_input[- index - 1], end ="")
    print()

user_input = input("Enter a string: ")
reverse_string(user_input)
