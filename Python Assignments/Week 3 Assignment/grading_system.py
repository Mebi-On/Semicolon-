# Number 2

grade_1 = int(input("Enter your grade: "))
grade_2 = int(input("Enter your grade: "))
grade_3 = int(input("Enter your grade: "))

average_grade = (grade_1 + grade_2 + grade_3) / 3
print(average_grade)

if 90 <= average_grade <= 100:
     print("A")
elif 80 <= average_grade < 90:
     print("B")
elif 70 <= average_grade < 80:
    print("C")
elif 60 <= average_grade < 70:
    print("D")
elif 0 <= average_grade < 60:
    print("F")