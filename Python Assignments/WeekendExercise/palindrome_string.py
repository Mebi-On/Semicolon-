def palindrome_string(user_input):
    reversed_string = "" 

    for index in range(len(user_input)):
        reversed_string += (user_input[- index + len(user_input) - 1])

    if user_input.lower() == reversed_string.lower():
        print("The string is a palindrome")
    else:
        print("The string is NOT a palindrome")

user_input = input("Enter a string to check palindrome: ")
palindrome_string(user_input)
