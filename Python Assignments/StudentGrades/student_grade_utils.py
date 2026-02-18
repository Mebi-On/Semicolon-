def is_valid_input(user_input: int):
        if user_input.isdigit():
            user_input = int(user_input)
            if user_input < 0 or user_input > 100:
                print("Invalid input. Please enter a valid int.")
                return False
            else:
                return True
        else:
            print("Invalid input. Please enter a valid int.")
            return False
        

def calculate_student_average(grades: list, students: int):
     sum_of_grades = 0
     for  subject in range(len(grades[students])):
         sum_of_grades += grades[students][subject]
     average_of_grades = sum_of_grades / len(grades[students])
     return average_of_grades

def calculate_student_total(grades: list, students: int):
     sum_of_grades = 0
     for  subject in range(len(grades[students])):
         sum_of_grades += grades[students][subject]
     return sum_of_grades

def student_position_find(average_score: list):
     position = []
     for first_number in range (len(average_score)):
          current_position = 1
          for second_number in range(len(average_score)):
               if (average_score[second_number] > average_score[first_number]):
                    current_position += 1 
          position[first_number] = current_position
     return position
