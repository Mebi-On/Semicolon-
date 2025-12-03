# Number 1


fathers_age = int(input("Enter the fathers current age: "))
sons_age = int(input("Enter the sons currnet age: "))

if 1 <= fathers_age and sons_age <= 80:
    years = fathers_age - 2*sons_age
    if years >= 1 :
        print("In", years, "years, the father will be twice as old as the son.")
    else:
        print("It was", abs(years), "years ago that the father was twice as old as the son.")

else:
    print("Invalid must be in the range of 1 and 80")


