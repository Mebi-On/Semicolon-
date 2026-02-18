import student_grade_utils as utils

def student_grades():
    user_input = input("Enter number of students: ")
    number_of_students = utils.is_valid_input(user_input)
    user_input = input("Enter number of subjects")
    number_of_subjects = utils.is_valid_input(user_input)
    print(number_of_students)
    print(number_of_subjects)
    if is_valid_input(user_input) == False:
            continue

        collection_rate = int(user_input)

student_grades()