
def highest_common_denominator(list_of_numbers: list):
    denominators = common_denominators(list_of_numbers)
    highest_common_denominator = 0
    all_common_denominators = []
    for numbers in denominators:
        count = 0
        for index in range(len(denominators)):
            if numbers == denominators[index]:
                count += 1
        if count == len(list_of_numbers):
            all_common_denominators += [numbers]
    for numbers in all_common_denominators:
        if numbers > highest_common_denominator:
            highest_common_denominator = numbers
    
    return highest_common_denominator

def common_denominators(numbers: list):
    denominators = []
    for number in numbers:
        for denominator in range (2, number// 2 + 1):
            if number % denominator == 0:
                denominators += [denominator]
    return (denominators)
    
     
#numbers = [6, 9, 15]   
#numbers = [60, 20, 24]
#numbers = [10, 15, 20]
#print(highest_common_denominator(numbers))
