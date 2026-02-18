

#1
print("#1")
def sumOfIncriments(): 
	sum = 0

	for index in range(1, 20001, 10):
		sum += index

	return sum

print(sumOfIncriments())

#2
print("\n#2")
def mutiplesOfThree():
    for index in range (1, 16):
        print(index * 3, end = " ")

mutiplesOfThree()

#3
print("\n")
print("\n#3")
def evenOneToHundred():
    for index in range (1, 101):
            if index % 2 == 0:
                print(index, end = " ")
            
evenOneToHundred()

#4
print("\n")
print("\n#4")
def passesAndFails():
        passes = 0
        fails = 0
        count = 0

        while count < 15:
                scores = int(input("Enter student grades:"))
                count += 1

                if scores < 0 or scores > 100:
                        count -= 1
                        print("Invalid Input, try again")
                else:
                        if scores >= 45:
                                passes += 1
                        else:
                                fails +=1

        print("No. Of Students that Passed", passes)
        print("No. Of Students that Failed", fails)


passesAndFails()

#5
print("\n")
print("#5")
def multiplicationTable():
        number = int(input("Enter a number: "))
        for index in range(1, 11):
                print(number,"x", index, "=", number*index)
                
multiplicationTable()

#6
print("\n")
print("#6")
def rightAngleTriangle():
        num = int(input("Enter the lenght of the Triangle: "))

        for height in range(num + 1):
            for legth in range(height):
                print("*", end = " ")
            print()
            
rightAngleTriangle()

#7
print("\n")
print("#7")
def numberedTriangle():
        for height in range(5, 0, -1):
            for length in range(height, 0, -1):
                print(length, end = " ")
            print()


numberedTriangle()

#8
print("\n")
print("#8")
def foutRightAngledTriangles():
                
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
            for k in range (height):
                print('*', end = " ")
            print()


        print()
        print("(d)")
        for height in range (userInput + 1):
            for length in range (userInput - height):
                 print(' ', end =' ')
            for k in range (height):
                print('*', end = " ")
            print()
            
foutRightAngledTriangles()

