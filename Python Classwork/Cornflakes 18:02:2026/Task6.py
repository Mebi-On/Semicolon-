

num = int(input("Enter the lenght of the Triangle: "))

for height in range(num + 1):
    for legth in range(height):
        print("*", end = " ")
    print()
