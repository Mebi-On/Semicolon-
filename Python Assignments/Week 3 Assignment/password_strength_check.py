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
