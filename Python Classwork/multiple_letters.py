
def multiple_letters():
    continue_loop = True
    result = ""
    user_word = input("Enter a word: ")
    user_number = int(input("Enter a number: "))
        
    for letterIndex in range(len(user_word)):
        result += (user_word[letterIndex] * user_number)
    return result

print(multiple_letters())
