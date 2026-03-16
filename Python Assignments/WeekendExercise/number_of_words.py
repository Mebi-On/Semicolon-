def number_of_words(user_input):
    number_of_words = 1
    for characters in user_input:
        if characters == " ":
            number_of_words += 1
    print(number_of_words)

user_input = input("Enter a sentence: ")
number_of_words(user_input)