
userInput = int(input("Enter height of the Triangls: "))

print("(a)")
for height in range(userInput + 1):
    for length in range(height):
        print("*", end = " ")
    print()
print()
print("(b)")
print()
for height in range(userInput, 0, -1):
    for length in range(height, 0, -1):
        print("*", end = " ")
    print()

print()
print("(c)")
print()
for height in range (userInput, 0, -1):
    for length in range (userInput - height):
         print(' ', end =' ')
    for space in range (height):
        print('*', end = " ")
    print()


print()
print("(d)")
for height in range (userInput + 1):
    for length in range (userInput - height):
         print(' ', end =' ')
    for space in range (height):
        print('*', end = " ")
    print()
