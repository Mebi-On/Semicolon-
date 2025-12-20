def largest_list(input:  list):
    largest = -1000000
    for numbers in input:
        if numbers > largest:
            largest = numbers
    return largest
print(largest_list([8, 4, 9, 2, 5, 7, 3]))