# Number 5

year = int(input("Enter year: "))

if year % 4 ==0 :
    if year % 100 != 0 or year % 400 == 0:
        print(year, "is a leap year")
    else:
        print(year, "not a leap year")
