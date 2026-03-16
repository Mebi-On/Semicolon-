def uppercase_count (user_input):
    uppercase_letters = 0
    for letters in user_input:
        if letters.isupper():
            uppercase_letters += 1

    print("Number of uppercase letters:", uppercase_letters)

user_input = input("Enter a string: ")
uppercase_count(user_input)
