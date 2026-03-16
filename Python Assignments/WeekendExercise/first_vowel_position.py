def first_vowel_position(user_input):
    vowels = "aeiou"
    for index in range(len(user_input)):
        if user_input[index].lower() in vowels:
            print("The position of the first vowel in the string is", index + 1)
            break

user_input = input("Enter a string: ")
first_vowel_position(user_input)
