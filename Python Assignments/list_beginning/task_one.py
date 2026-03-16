
def selection_sort_list(nums):
    for index in range (len(nums)):
        minimum_index = index
        for second_index in range (minimum_index + 1, len(nums)):
            if nums[second_index] <= nums[minimum_index]:
                minimum_index = second_index
        nums[index], nums[minimum_index] = nums[minimum_index], nums[index]
    return nums

def even_only_list(nums):
    new_list = []
    for numbers in nums:
        if numbers % 2 == 0:
            new_list += [numbers]
    return new_list


def combine_lists(first_list, second_list):
    for numbers in second_list:
        first_list.append(numbers)
    return first_list


def more_than_three(string_list):
    new_list = []
    for words in string_list:
        if len(words) > 3:
            new_list += [words]
    return new_list

