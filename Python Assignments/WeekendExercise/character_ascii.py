def character_ascii (user_input):
    for characters in user_input:
        print(ord(characters), end=", ")
    print()

user_input = input("Enter a string: ")
character_ascii(user_input)