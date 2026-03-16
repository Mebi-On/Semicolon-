def reverse_integer(user_input):
    list_of_letters = list(user_input)
    reversed_list = []
    
    for index in range(len(list_of_letters)):
        reversed_list.append(list_of_letters[- index + len(list_of_letters) - 1]) 
    
    for numbers in reversed_list:
        print(int(numbers), end="")
    print()

user_input = (input("Enter a integer: "))
reverse_integer(user_input)