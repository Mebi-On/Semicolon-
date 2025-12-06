#Morning cupcake 1

#Write a program that takes a word as a string and prints out the number of vowels and consonants in the word

string_input = input("Enter a string: ")
vowel_count = 0
consonant_count = 0

if " " in string_input:
	print("Error, only input  one word") 
else:
	for letter in string_input:
		if letter in 'aeiou':
			vowel_count += 1
		else:
			consonant_count += 1


	print("Number of vowels: ", vowel_count)
	print("Number of consonants: ", consonant_count)