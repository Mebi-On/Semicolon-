
def word_count():
    continue_loop = True
    while continue_loop :
        word = input("Enter a word: ")
        if word.isalpha() == True:
            continue_loop = False
            return len(word)
        else:
            continue_loop = True
            print("Invalid input.")
            
        

            
print(word_count())
