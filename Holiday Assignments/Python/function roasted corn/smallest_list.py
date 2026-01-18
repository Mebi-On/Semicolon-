def smallest_list(input:  list):
    smallest = 1000000
    for numbers in input:
        if numbers < smallest:
            smallest = numbers
    return smallest

print(smallest_list([8, 4, 9, 2, 5, 7, 3]))