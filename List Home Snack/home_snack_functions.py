import random

def list_of_random_numbers_one_to_fifty():
    list_of_random_numbers = []
    for _ in range(10):
        list_of_random_numbers += [random.randint(1, 50)]

    return list_of_random_numbers

def length_of_list(random_list):
    count = 0
    for elements in random_list:
        count += 1
    return count

def sum_of_even_positions_of_a_list(new_list):
    sum_of_even_elements = 0
    for index in range(len(new_list)):
        if index % 2 == 0:
            sum_of_even_elements += new_list[index]
    return sum_of_even_elements

def sum_of_odd_positions_of_a_list(new_list):
    sum_of_odd_elements = 0
    for index in range(len(new_list)):
        if index % 2 != 0:
            sum_of_odd_elements += new_list[index]
    return sum_of_odd_elements

def product_of_all_third_positions_of_a_list(new_list):
    product_of_elements = 1
    for index in range(1, len(new_list) + 1):
        if index % 3 == 0:
            product_of_elements *= new_list[index - 1]
    return product_of_elements

def average_of_all_elements_in_a_list(new_list):
    sum_of_elements = 0
    average = 0
    for elements in new_list:
        sum_of_elements += elements
    if len(new_list) > 0:
        average = sum_of_elements / len(new_list)
    return average

def largest_element_in_a_list(new_list):
    largest_number = 0
    for numbers in new_list:
        if numbers > largest_number:
            largest_number = numbers
    return largest_number

def smallest_element_in_a_list(new_list):
    if len(new_list) == 0:
        return None
    smallest_number = new_list[0]
    for numbers in new_list:
        if numbers < smallest_number:
            smallest_number = numbers
    return smallest_number

def number_of_strings_in_list_of_strings(list_of_strings):
    number_of_strings = 0
    for _ in list_of_strings:
        number_of_strings += 1
    return number_of_strings

def same_first_and_last_character_of_a_string(list_of_strings):
    result = []
    for string in list_of_strings:
        if len(string) >= 2 and string[0] == string[-1]:
            result += [string]
    return result

def sequencial_list_of_numbers():
    list_of_numbers = []
    for number in range(1, 16):
        list_of_numbers += [number]
    return list_of_numbers

def sum_of_all_third_positions_of_a_list(new_list):
    sum_of_elements = 0
    for index in range(1, len(new_list) + 1):
        if index % 3 == 0:
            sum_of_elements += new_list[index - 1]
    return sum_of_elements

def sum_of_first_middle_last_elements_of_a_list(new_list):
    sum_of_elements = 0
    if len(new_list) > 2:
        if len(new_list) % 2 == 0:
            middle_index_left = len(new_list) // 2
            middle_index_right = middle_index_left - 1
            middle_element = (new_list[middle_index_left] + new_list[middle_index_right]) / 2
            sum_of_elements = new_list[0] + middle_element + new_list[-1]
        else:
            middle_index = len(new_list) // 2
            sum_of_elements = new_list[0] + new_list[middle_index] + new_list[-1]
        return sum_of_elements
    else:
        return sum(new_list)

print(sum_of_first_middle_last_elements_of_a_list([1]))