
def reverse_string(user_input):
    reversed_list = []

    for index in range(len(list_of_letters)):
        reversed_list.append(list_of_letters[- index + len(list_of_letters) - 1]) 
    
    for characters in reversed_list:
        print(characters, end="")
    print()

def reverse_integer(user_input):
    list_of_letters = list(user_input)
    reversed_list = []
    
    for index in range(len(list_of_letters)):
        reversed_list.append(list_of_letters[- index + len(list_of_letters) - 1]) 
    
    for numbers in reversed_list:
        print(int(numbers), end="")
    print()

def uppercase_count (list_of_letters):
    uppercase_letters = 0
    for letters in list_of_letters:
        if letters.isupper():
            uppercase_letters += 1

    print("Number of uppercase letters:", uppercase_letters)

def lowercase_count(list_of_letters):
    lowercase_letters = 0
    for letters in list_of_letters:
        if letters.islower():
            lowercase_letters += 1

    print("Number of lowercase letters:", lowercase_letters)

def first_vowel_position(list_of_letters):
    vowels = "aeiou"
    for index in range(len(list_of_letters)):
        if list_of_letters[index].lower() in vowels:
            print("The position of the first vowel in the string is", index + 1)
            break

def character_ascii (list_of_letters):
    for characters in list_of_letters:
        print(ord(characters), end=", ")
    print()

def avg_one_to_hundred():
    total = 0
    sum_total = 0
    for numbers in range(1,101):
        total += 1
        sum_total += numbers
    print("Average of numbers from 1 to 100 =",sum_total/total)

def divisors(user_input):
    print("The divisors for", user_input, "are:", end =" ")
    number_of_divisors = 0
    for index in range(1, user_input + 1):
        if user_input % index == 0:
            number_of_divisors += 1
            print(index, end=", ")
    print("\nNumber of diviorsors =",number_of_divisors)

def power(number, exp):
    result = 1
    for _ in range(exp):
        result *= number
    print(result)

def palindrome_number(user_input):
    list_of_digits = list(user_input)
    reversed_list = []

    for index in range(len(list_of_digits)):
        reversed_list.append(list_of_digits[- index + len(list_of_digits) - 1])

    if list_of_digits == reversed_list:
        print("The number is a palindrome")
    else:
        print("The number is NOT a palindrome")

def palindrome_string(user_input):
    list_of_letters = list(user_input)
    reversed_list = []

    for index in range(len(list_of_letters)):
        reversed_list.append(list_of_letters[- index + len(list_of_letters) - 1])

    if list_of_letters == reversed_list:
        print("The string is a palindrome")
    else:
        print("The string is NOT a palindrome")

def number_of_words(list_of_letters):
    number_of_words = 1
    for characters in list_of_letters:
        if characters == " ":
            number_of_words += 1
    print(number_of_words)

def sum_of_even_digits(user_input):
    sum_of_even = 0
    for numbers in user_input:
        if int(numbers) % 2 == 0:
            sum_of_even += int(numbers)
        
    print("Sum of all even digits is =", sum_of_even)

def sum_of_odd_digits(user_input):
    sum_of_odd = 0
    for numbers in user_input:
        if int(numbers) % 2 != 0:
            sum_of_odd += int(numbers)
    print("Sum of all even digits is =", sum_of_odd)

def prime_numbers():
    number_of_primes = 0
    for numbers in range(2, 101):
        is_prime = True
        for i in range (2, numbers):
            if numbers % i == 0:
                is_prime = False
                break
        if is_prime:
            number_of_primes += 1
            print(numbers, end =" ")    
            
    print("\nTotal primes between 1-100 is: ",number_of_primes)

def fibonacci_sequence():
    num_1 = 0
    num_2 =1
    for _ in range(20):
        print(num_1, end=" ")
        temp = num_2
        num_2 = num_1 + num_2
        num_1 = temp
    print()

def binary_to_decimal(user_input):
    decimal_value = 0
    for index in range(len(user_input)):
        decimal_value += int(user_input[- index - 1]) * (2 ** index)
    print("Decimal value is =", decimal_value)

def decimal_to_binary(user_input):
    binary_value = ""
    while user_input > 0:
        binary_value = str(user_input % 2) + binary_value
        user_input //= 2
    print("Binary value is =", binary_value)    

user_input = input("Enter a string: ")
list_of_letters = list(user_input)
reverse_string(user_input)

user_input = (input("Enter a integer: "))
reverse_integer(user_input)

user_input = input("Enter a string: ")
user_input = user_input.replace(" ", "")
list_of_letters = list(user_input)
uppercase_count(list_of_letters)
lowercase_count(list_of_letters)
first_vowel_position(list_of_letters)
character_ascii(list_of_letters)

avg_one_to_hundred()

user_input = input("Enter a number to check palindrome: ")
palindrome_number(user_input)

user_input = input("Enter a string to check palindrome: ")
palindrome_string(user_input)

user_input = int(input("Enter a integer: "))
divisors(user_input)

number = int(input("Enter a number: "))
exp = int(input("Enter the power raside to: "))
power(number, exp)

user_input = input("Enter a sentence: ")
list_of_letters = list(user_input)
number_of_words(list_of_letters)

user_input = (input("Enter a integer: "))
sum_of_even_digits(user_input)
sum_of_odd_digits(user_input)

prime_numbers()

fibonacci_sequence()

user_input = input("Enter a binary number: ")
binary_to_decimal(user_input)

user_input = int(input("Enter a decimal number: "))
decimal_to_binary(user_input)