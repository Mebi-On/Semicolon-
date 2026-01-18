def square_list(input: list):
    new_lst = []
    for index in range(len(input)):
        input[index] = input[index] ** 2
    return input

print(square_list([2, 3, 4, 5, 7]))