# Number 3

int_1 = int(input("Enter a number: "))
operand= input("Enter your operation (+, -, *, /) ")
int_2 = int(input("Enter a number: "))

if operand == '+':
    result = int_1 + int_2
    print(result)
elif operand == '-':
    result = int_1 - int_2
    print(result)
elif operand == '*':
    result = int_1 * int_2
    print(result)
elif operand == '/':
    result = int_1 / int_2
    print(result)
else:
    print("Error")