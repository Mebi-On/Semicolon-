def decimal_to_binary(user_input):
    binary_value = ""
    while user_input > 0:
        binary_value = str(user_input % 2) + binary_value
        user_input //= 2
    print("Binary value is =", binary_value)    

user_input = int(input("Enter a decimal number: "))
decimal_to_binary(user_input)