def lowercase_count(user_input):
    lowercase_letters = 0
    for letters in user_input:
        if letters.islower():
            lowercase_letters += 1

    print("Number of lowercase letters:", lowercase_letters)

user_input = input("Enter a string: ")
lowercase_count(user_input)
