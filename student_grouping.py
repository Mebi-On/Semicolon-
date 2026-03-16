import random

def collect_student_names():
    number_of_students = int(input("Enter the number of students: "))
    list_of_students = []
    for index in range(number_of_students):
        student_name = input("Enter the name of student: ")
        list_of_students.append(student_name)
    print("SAVED")
    return list_of_students

def randomize_students(list_of_students, number_of_students):
    group_size = int(input("Enter the size of group: "))
    number_of_groups = number_of_students // group_size
    
    groups = []
    for index in range(number_of_groups):
        group = []
        for student in range(group_size):
            random_student = random.choice(list_of_students)
            group.append(random_student)
            list_of_students.remove(random_student)
        groups.append(group)

    for group in groups:
        print(group)
    print("Leftover students: ", list_of_students)

def student_grouping():
    list_of_students = collect_student_names()
    number_of_students = len(list_of_students)
    randomize_students(list_of_students, number_of_students) 

student_grouping()