print("Question 4: BMI Category")
weigth = int(input("Enter your weigth in kg: "))
height = int(input("Enter your height in meter: "))
bmi = weigth / (height * height)

if bmi < 18.5:
    print("Underweigth")
elif 18.5 <= bmi <= 24.9:
    print("Normal")
elif 25 <= bmi <= 29.9:
    print("Overweigth")
else:
    print("Obesity")
print()