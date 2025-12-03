
print("Question 1: Safe Division")
first_number = int(input("Enter the first number: "))
second_number = int(input("Enter the second number: "))

if second_number != 0:
    result = first_number / second_number
    print(result)
if second_number == 0:
    print("Cannot division by zero")
print()