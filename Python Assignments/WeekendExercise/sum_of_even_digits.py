def sum_of_even_digits(user_input):
    sum_of_even = 0
    for numbers in user_input:
        if int(numbers) % 2 == 0:
            sum_of_even += int(numbers)
        
    print("Sum of all even digits is =", sum_of_even)

user_input = (input("Enter a integer: "))
sum_of_even_digits(user_input)