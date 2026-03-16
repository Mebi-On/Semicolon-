
def sort_list(list_of_numbers):
	for index in range (len(list_of_numbers)):
		minimum_index = index
		for second_index in range (minimum_index + 1, len(list_of_numbers)):
			if list_of_numbers[second_index] < list_of_numbers[minimum_index]:
                		minimum_index = second_index
		list_of_numbers[index], list_of_numbers[minimum_index] = list_of_numbers[minimum_index], list_of_numbers[index]
	return list_of_numbers
    
def second_largest_number(list_of_numbers: list):
    list_of_numbers = sort_list(list_of_numbers)
    second_largest_number = list_of_numbers[-2]
    return second_largest_number

def second_lowest_number(list_of_numbers: list):
    list_of_numbers = sort_list(list_of_numbers)
    second_lowest_number = list_of_numbers[1]
    return second_lowest_number
    
def difference_between_second_highest_and_second_lowest_numbers(list_of_numbers: list):
    if len(list_of_numbers) < 4:
        return "Invalid list, list too short"
    else:
        return second_largest_number(list_of_numbers) - second_lowest_number(list_of_numbers)
