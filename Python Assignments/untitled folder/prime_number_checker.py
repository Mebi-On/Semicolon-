user_number = int(input("Enter a number: "))

for number in range(2, user_number//2 + 1):
    if number % user_number == 0:
        primt = False
prime = True
if prime == True:
    print(f"The number {user_number} is a prime number")
else:
    print(f"The number {user_number} is not a prime number")


print(f"All prime numbers between 1 and {user_number} are: ", end ="")
for numbers in range(2, user_number):
    prime = True
    for number in range(2, numbers//2 + 1):
        if numbers % number == 0:
            prime = False
            break

    if prime:
        print(numbers, end = " ")

print()