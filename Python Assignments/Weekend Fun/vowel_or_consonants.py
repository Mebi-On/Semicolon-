print("Question 8: Vowel or Consonants")
letter = input("Enter a letter: ").lower()

if len(letter) > 1:
    print("Error, retry!")
else:
    if letter in 'aeiou':
    	print("Vowel")
    else:
        print("Consonant")
print()
