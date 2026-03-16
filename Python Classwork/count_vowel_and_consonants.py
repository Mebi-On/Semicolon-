def count_vowel_and_consonants(user_input):
    user_input.replace(" ", "").lower()
    vowels = "aeiou"
    vowel_count = 0
    consonant_count = 0 
    for index in range(len(user_input)):
        if user_input[index].lower() in vowels:
            vowel_count += 1
        else:
            consonant_count += 1
    print("The number of vowels is", vowel_count)
    print("The number of consonants is", consonant_count)


user_input = input("Enter a string: ")
count_vowel_and_consonants(user_input)
