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
