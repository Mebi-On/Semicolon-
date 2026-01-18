#2.15
num_1 = float(input("Enter first integer: "))
num_2 = float(input("Enter second integer: "))
num_3 = float(input("Enter third integer: "))

if num_1 <= num_2 and num_1 <= num_3:
    smallest = num_1
    if num_2 <= num_3:
        middle = num_2
        largest = num_3
        print(smallest, middle, largest)
    else:
        middle = num_3
        largest = num_2
        print(smallest, middle, largest)
elif num_2 <= num_1 and num_2 <= num_3:
    smallest = num_2
    if num_1 <= num_3:
        middle = num_1
        largest = num_3
        print(smallest, middle, largest)
    else: 
        middle = num_3
        largest = num_1
        print(smallest, middle, largest)
else:
    smallest = num_3
    if num_1 <= num_2:
        middle = num_1
        largest = num_2
        print(smallest, middle, largest)
    else:
        middle = num_2
        largest = num_1
        print(smallest, middle, largest)
