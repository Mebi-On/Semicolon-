# Number 1


fathers_age = int(input("Enter the fathers current age: "))
sons_age = int(input("Enter the sons currnet age: "))

if 1 <= fathers_age and sons_age <= 80:
    years = fathers_age - 2*sons_age
    if years >= 1 :
        print("In", years, "years, the father will be twice as old as the son.")
    else:
        print("It was", abs(years), "years ago that the father was twice as old as the son.")

else:
    print("Invalid must be in the range of 1 and 80")


# # Number 2

grade_1 = int(input("Enter your grade: "))
grade_2 = int(input("Enter your grade: "))
grade_3 = int(input("Enter your grade: "))

average_grade = (grade_1 + grade_2 + grade_3) / 3
print(average_grade)

if 90 <= average_grade <= 100:
     print("A")
elif 80 <= average_grade < 90:
     print("B")
elif 70 <= average_grade < 80:
    print("C")
elif 60 <= average_grade < 70:
    print("D")
elif 0 <= average_grade < 60:
    print("F")


# # Number 3

int_1 = int(input("Enter a number: "))
operand= input("Enter your operation (+, -, *, /) ")
int_2 = int(input("Enter a number: "))

if operand == '+':
    result = int_1 + int_2
    print(result)
elif operand == '-':
    result = int_1 - int_2
    print(result)
elif operand == '*':
    result = int_1 * int_2
    print(result)
elif operand == '/':
    result = int_1 / int_2
    print(result)
else:
    print("Error")
    

# Number 4

password = input("Insert your password: ")

strength = len(password)
print (strength)
if 10 <= strength:
    print("Strong")
elif 6 < strength <= 10 :
    print("Medium")
elif 6 > strength:
    print("Weak")
elif 1 > strength:
    print("Invalid")


# Number 5

year = int(input("Enter year: "))

if year % 4 ==0 :
    if year % 100 != 0 or year % 400 == 0:
        print(year, "is a leap year")
    else:
        print(year, "not a leap year")

# Number 6

letter = input("Input a letter: ")
if len(letter) == 1:
    if letter == "a":
        print("Vowel") 
        print(letter)
    if letter == "a":
        print("Vowel") 
        print(letter)
    if letter == "a":
        print("Vowel") 
        print(letter)
    if letter == "a":
        print("Vowel") 
        print(letter)
    if letter == "a":
        print("Vowel") 
        print(letter)
    else:
        print("Consonant")
        print (letter)
    
else:
    print("Invalid")

