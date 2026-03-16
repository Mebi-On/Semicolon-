def binary_to_decimal(user_input):
    decimal_value = 0
    for index in range(len(user_input)):
        decimal_value += int(user_input[- index - 1]) * (2 ** index)
    print("Decimal value is =", decimal_value)

user_input = input("Enter a binary number: ")
binary_to_decimal(user_input)