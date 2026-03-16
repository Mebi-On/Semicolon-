def sort_list(list_of_numbers):
	for index in range (len(list_of_numbers)):
		minimum_index = index
		for second_index in range (minimum_index + 1, len(list_of_numbers)):
			if list_of_numbers[second_index] < list_of_numbers[minimum_index]:
                		minimum_index = second_index
		list_of_numbers[index], list_of_numbers[minimum_index] = list_of_numbers[minimum_index], list_of_numbers[index]
	return list_of_numbers

def even_list(list_of_numbers):
	list_of_numbers = sort_list(list_of_numbers)	
	result = []
	for numbers in list_of_numbers :
		if numbers % 2 == 0:
			result += [numbers]
	return result

list_of_numbers = [2, 1, 6, 3, 4]
print(even_list(list_of_numbers))
			
list_of_numbers = [10, 5, 4, 8, 15]
print(even_list(list_of_numbers))


                
        

