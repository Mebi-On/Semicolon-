#2.1
#a x = 2
#b Value of 2 + 2 is 4
#c x =
#d 5 = 5

#2.2
# In python all inputs are strings by defult. Therefoe we need to convert the string into an int with the intt() function.
# The code should read rating = int(input('Enter an integer rating between 1 and 10'))

#2.3
grade = 91
if grade >= 90:
    print("Congratulations! Your grade of %d earns you an A in this course" % grade)

#2.4 
a = 27.5 + 2
print(a)
b = 27.5 - 2
print(b)
c = 27.5 * 2
print(c)
d = 27.5 / 2
print(d)
e = 27.5 // 2
print(e)
f = 27.5 ** 2
print(f)

#2.5
r = 2
diameter = 2 * r
print ("Diameter =", diameter)
circumference = diameter * 3.14159
print ("Circumference =", circumference)
area = 3.14159 * r ** 2
print ("Area =", area)

#2.6
odd_or_even = int(input("Enter an integer: "))
if odd_or_even % 2 == 0:
    print(odd_or_even, "is even")
else:
    print(odd_or_even, "is odd")

#2.7
if 1024 % 4 == 0:
    print("True! 1024 is a multiple of 4")
else:
    print("False! 1024 is not a multiple of 4")

if 2 % 10 == 0:
    print("True! 2 is a multiple of 10")
else:
    print("False! 2 is not a multiple of 10")

#2.8
print("number\tsquare\tcube")

for i in range(6):
    print(i, "\t", i**2, "\t", i**3)

#right aligned 
print(f"{'number':>6} {'square':>6} {'cube':>6}")

for n in range(6):
    print(f"{n:>6} {n**2:>6} {n**3:>6}")

#2.9
print(ord('B'))
print(ord('C'))
print(ord('D'))
print(ord('b'))
print(ord('c'))
print(ord('d'))
print(ord('0'))
print(ord('1'))
print(ord('2'))
print(ord('$'))
print(ord('*'))
print(ord('+'))
print(ord(' '))

#2.10
num_1 = int(input("Enter a numbers: "))
num_2 = int(input("Enter a numbers: "))
num_3 = int(input("Enter a numbers: "))

num_lst = [num_1, num_2, num_3]
sum = sum(num_lst)
print("Sum:", sum)
average = sum / 3
print("Average:", average)
product = num_1 * num_2 * num_3
print("Product:", product)  
smallest = min(num_lst)
print("Smallest:", smallest)
largest = max(num_lst)
print("Largest:", largest)

#2.11
seperate_num = int(input("Enter a five digit number: "))
if len(str(seperate_num)) == 5:
    num_1 = seperate_num // 10000
    num_2 = (seperate_num % 10000) // 1000
    num_3 = (seperate_num % 1000) // 100
    num_4 = (seperate_num % 100) // 10
    num_5 = seperate_num % 10
    print(num_1, num_2, num_3, num_4, num_5, sep = "   ")
else:
    print("Please enter a five digit number.")

#2.12
invesment = int(input("Enter the invesment amount: "))
rate = 7

future_value_10 = invesment * (1 + (rate / 100)) ** 10
future_value_20 = invesment * (1 + (rate / 100)) ** 20
future_value_30 = invesment * (1 + (rate / 100)) ** 30

print ("Future value after 10 years is: %.2f " %future_value_10)
print ("Future value after 20 years is: %.2f " %future_value_20)
print ("Future value after 30 years is: %.2f " %future_value_30)

#2.13
i = 20
while i <= 100:
    a = int(input("Enter an integer: "))
    b = int(input("Enter an integer: "))
    result = a ** b
    print(result)
# No python doesnt have a max interger size, python all  intergers that can be calculated  

#2.14
age = int(input("Enter your age: "))
max_heart_rate = 220 - age
target_heart_rate_lower = max_heart_rate * 0.5
target_heart_rate_upper = max_heart_rate * 0.85
print("Your maximum heart rate is", max_heart_rate, "BPM")
print("Your target heart rate is between", target_heart_rate_lower, "and", target_heart_rate_upper, "BPM")

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