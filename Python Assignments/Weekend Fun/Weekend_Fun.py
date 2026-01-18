
#1

print("Question 1: Safe Division")
first_number = int(input("Enter the first number: "))
second_number = int(input("Enter the second number: "))

if second_number != 0:
    result = first_number / second_number
    print(result)
if second_number == 0:
    print("Cannot division by zero")
print()

#2
print("Question 2: Largest of three")
number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))
number3 = int(input("Enter the third number: "))

if number1 >= number2 and number1 >= number3:
    print("The largest number is:",  number1)
if number2 >= number1 and number2 >= number3:
    print("The largest number is:",  number2)
else:
    print("The largest number is:",  number3)
print()

#3
print("Question 3: Ticket Price Calculator")
age = int(input("Enter your age: "))

if age < 5:
    print("Free")
elif 5 <= age <= 12:
    print("$5")
elif  13 <= age <= 64:
    print("$12")
else:
    print("$8")
print()

#4
print("Question 4: BMI Category")
weigth = int(input("Enter your weigth in kg: "))
height = int(input("Enter your height in meter: "))
bmi = weigth / (height * height)

if bmi < 18.5:
    print("Underweigth")
elif 18.5 <= bmi <= 24.9:
    print("Normal")
elif 25 <= bmi <= 29.9:
    print("Overweigth")
else:
    print("Obesity")
print()

#5
print("Question 5: Discount Eligibility")
total_bill = int(input("Enter the total bill amount: "))
is_member = input("Are you a member? ('yes' or 'no'): ")
if total_bill >= 1000 and is_member == 'yes':
    discount = total_bill * 0.1
    final_amount = total_bill - discount
    print("Final amount is:", final_amount)
elif total_bill >= 1000 and is_member == 'no':
    discount = total_bill * 0.05
    final_amount = total_bill - discount
    print("Final amount is:", final_amount)
else:
    final_amount = total_bill
    print("Final amount is:", final_amount)
print()

#6
print("Question 6: Quadrant Finder")
x = int(input("Enter integer x: "))
y = int(input("Enter integer y: "))

if x > 0 and y > 0:
    print("Q1")
if x < 0 and y > 0:
    print("Q2")
if x < 0 and y < 0:
    print("Q3")
if x > 0 and y < 0:
    print("Q4")
if x == 0 and y == 0:
    print("Origin")
if y == 0 and x != 0:
    print("X-axis")
if x == 0 and y != 0:
    print("Y-axis")
print()

# 7
print("Question 7: Rock-Paper-Scissors")
p_1 = input("Player 1 enter rock, paper or scissors: ").lower
p_2 = input("Player 2 enter rock, paper or scissors: ").lower

if p_1 != p_2:
    if p_1 == "scissors":
        if p_2 == "rock":
            print("Player 2 won")
        else:
            print("Player 1 won")

    elif p_1 == "rock":
        if p_2 == "paper":
            print("Player 2 won")
        else:
            print("Player 1 won")

    elif p_1 == "paper":
        if p_2 == "scissors":
            print("Player 2 won")
        else:
            print("Player 1 won")
else:
    print("Tie")
print()


# 8 
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
