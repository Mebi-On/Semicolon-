#Write a program that prints even numbers between 1 - 100 in a straight line

for index in range (1, 101):
	if index % 2 == 0:
            print(index, end = " ")
