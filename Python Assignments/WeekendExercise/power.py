def power(number, exp):
    result = 1
    for _ in range(exp):
        result *= number
    print(result)

number = int(input("Enter a number: "))
exp = int(input("Enter the power raised to: "))
power(number, exp)