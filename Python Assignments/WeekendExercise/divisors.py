def divisors(user_input):
    print("The divisors for", user_input, "are:", end =" ")
    number_of_divisors = 0
    for numbers in range(1, user_input + 1):
        if user_input % numbers == 0:
            number_of_divisors += 1
            print(numbers, end=", ")
    print("\nNumber of diviorsors =",number_of_divisors)

user_input = int(input("Enter a integer: "))
divisors(user_input)