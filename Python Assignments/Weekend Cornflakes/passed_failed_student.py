passed_student = 0
failed_student = 0  

for students in range (1, 16):
    grade = int(input("Enter student %d grade: " % students))
    if grade >= 45:
        passed_student += 1
    else:   
        failed_student += 1
print("Number of passed students: ", passed_student)
print("Number of failed students: ", failed_student)