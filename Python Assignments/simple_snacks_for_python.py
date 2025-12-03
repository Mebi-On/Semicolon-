#Chukwudumebi Onwusah

#1 
print("Question 1: Greeting Chooser")
name = input("Enter your name")

if name == "Alex":
    print("Hellow, friend!")
else:
    print("Hello stranger!")
print()


#2
print("Question 2: Pet Chooser")
pet = input("Pick a pet! ('dog' or 'cat') ")
if pet == "dog":
    print("Woof! Dogs are awesome!")
else:
    print("Cool choice, but I love dogs!”")
print()


#3
print("Question 3: Favourite Number")
favorite_number = 7
user_number = int(input("Guess my favorite_number: "))

if user_number == favorite_number:
    print("Thats my favorite_number!")
else:
    print("Nice try. guess again!")
print()


#4
print("Question 4: Count to five")
for i in range(1, 6):
    print("Number", i)
print()


#5
print("Question 5: Even or Odd")
user_input = int(input("Enter a number!: "))

if user_input % 2 == 0:
    print("EVEN!")
else:
    print("ODD!")
print()
