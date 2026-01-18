def square_sum_list(input: list):
    sum_of_nums = 0
    for nums in input:
        sum_of_nums += nums ** 2
    return sum_of_nums

print(square_sum_list([2, 3, 4, 5, 7]))