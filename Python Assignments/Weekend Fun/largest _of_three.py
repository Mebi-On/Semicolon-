print("Question 2: Largest of three")
number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))
number3 = int(input("Enter the third number: "))

if number1 >= number2 and number1 >= number3:
    print("The largest number is:",  number1)
if number2 >= number1 and number2 >= number3:
    print("The largest number is:",  number2)
else:
    print("The largest number is:",  number3)
print()