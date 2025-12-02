
# #1
# first_number = int(input("Enter the first number: "))
# second_number = int(input("Enter the second number: "))

# if second_number != 0:
#     result = first_number / second_number
#     print(result)
# if second_number == 0:
#     print("Cannot division by zero")

# #2
# number1 = int(input("Enter the first number: "))
# number2 = int(input("Enter the second number: "))
# number3 = int(input("Enter the third number: "))

# if number1 >= number2 and number1 >= number3:
#     print("The largest number is:",  number1)  
# if number2 >= number1 and number2 >= number3:
#     print("The largest number is:",  number2)
# else:
#     print("The largest number is:",  number3)

# #3
# age = int(input("Enter your age: "))

# if age < 5:
#     print("Free")
# elif 5 <= age <= 12:
#     print("$5")
# elif  13 <= age <= 64:
#     print("$12")
# else:
#     print("$8")

# #4
# weigth = int(input("Enter your weigth in kg: "))
# height = int(input("Enter your height in meter: "))
# bmi = weigth / (height * height)

# if bmi < 18.5:
#     print("Underweigth")
# elif 18.5 <= bmi <= 24.9:
#     print("Normal")   
# elif 25 <= bmi <= 29.9:
#     print("Overweigth")
# else:
#     print("Obesity")   

# #5
# total_bill = int(input("Enter the total bill amount: "))
# is_member = input("Are you a member? ('yes' or 'no'): ")
# if total_bill >= 1000 and is_member == 'yes':
#     discount = total_bill * 0.1
#     final_amount = total_bill - discount
#     print("Final amount is:", final_amount)
# elif total_bill >= 1000 and is_member == 'no':
#     discount = total_bill * 0.05
#     final_amount = total_bill - discount
#     print("Final amount is:", final_amount)
# else:
#     final_amount = total_bill
#     print("Final amount is:", final_amount)

# #6
# x = int(input("Enter integer x: "))
# y = int(input("Enter integer y: "))

# if x > 0 and y > 0:
#     print("Q1")
# if x < 0 and y > 0:
#     print("Q2")
# if x < 0 and y < 0:
#     print("Q3")
# if x > 0 and y < 0:
#     print("Q4")
# if x == 0 and y == 0:
#     print("Origin")
# if y == 0 and x != 0:
#     print("X-axis")
# if x == 0 and y != 0:
#     print("Y-axis")

# # 7
# p_1 = input("Player 1 enter rock, paper or scissors: ")
# p_2 = input("Player 2 enter rock, paper or scissors: ")

# if p_1 != p_2:
#     if p_1 == "rock":
#         if p_2 == "scissors":
#             print("Player 1 wins")
#         else:
#             print("Player 2 wins")

#     elif p_1 == "paper":
#         if p_2 == "rock":
#             print("Player 1 wins")
#         else:
#             print("Player 2 wins")

#     elif p_1 == "scissors":
#         if p_2 == "paper":
#             print("Player 1 wins")
#         else:
#             print("Player 2 wins")
# else:
#     print("Tie")


# 8 
letter = input("Enter a letter: ").lower()
if letter in 'aeiou':
    print("Vowel")
else:
    print("Consonant")