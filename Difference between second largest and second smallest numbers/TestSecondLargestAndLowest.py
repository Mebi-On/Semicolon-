import unittest
from second_largest_and_lowest import *

class TestSecondLargestAndLowest(unittest.TestCase):

    def test_if_list_of_number_is_sorted_correctly(self):
        first_numbers = [2, 5, 7, 1, 6, 9]
        actual_result_one = sort_list(first_numbers)
        expected_result_one = [1, 2, 5, 6, 7, 9]
        self.assertEqual(actual_result_one, expected_result_one)
        second_numbers = [2, 6, 7, 1, 5]
        actual_result_two = sort_list(second_numbers)
        expected_result_two = [1, 2, 5, 6, 7]
        self.assertEqual(actual_result_two, expected_result_two)
        
    def test_if_second_largest_number_is_correct(self):
        first_numbers = [2, 5, 7, 1, 6, 9]
        actual_result_one = second_largest_number(first_numbers)
        expected_result_one = 7
        self.assertEqual(actual_result_one, expected_result_one)
        second_numbers = [2, 6, 7, 1, 5]
        actual_result_two = second_largest_number(second_numbers)
        expected_result_two = 6
        self.assertEqual(actual_result_two, expected_result_two)

    def test_if_second_lowest_number_is_correct(self):
        first_numbers = [2, 5, 7, 1, 6, 9]
        actual_result_one = second_lowest_number(first_numbers)
        expected_result_one = 2
        self.assertEqual(actual_result_one, expected_result_one)
        second_numbers = [2, 6, 7, 1, 5]
        actual_result_two = second_lowest_number(second_numbers)
        expected_result_two = 2
        self.assertEqual(actual_result_two, expected_result_two)

    def test_if_difference_is_correct(self):
        first_numbers = [2, 5, 7, 1, 6, 9]
        actual_result_one = difference_between_second_highest_and_second_lowest_numbers(first_numbers)
        expected_result_one = 5
        self.assertEqual(actual_result_one, expected_result_one)
        second_numbers = [2, 6, 7, 1, 5]
        actual_result_two = difference_between_second_highest_and_second_lowest_numbers(second_numbers)
        expected_result_two = 4
        self.assertEqual(actual_result_two, expected_result_two)
        
    def test_with_negative_numbers(self):
        first_numbers = [-2, -5, -7, -1, -6, -9]
        actual_result_one = difference_between_second_highest_and_second_lowest_numbers(first_numbers)
        expected_result_one = 5
        self.assertEqual(actual_result_one, expected_result_one)
        second_numbers = [-2, -6, -7, -1, -5]
        actual_result_two = difference_between_second_highest_and_second_lowest_numbers(second_numbers)
        expected_result_two = 4
        self.assertEqual(actual_result_two, expected_result_two)

    def test_with_short_lists(self):
        first_numbers = [2, 5, 7]
        actual_result_one = difference_between_second_highest_and_second_lowest_numbers(first_numbers)
        expected_result_one = "Invalid list, list too short"
        self.assertEqual(actual_result_one, expected_result_one)
        second_numbers = [2, 6]
        actual_result_two = difference_between_second_highest_and_second_lowest_numbers(second_numbers)
        expected_result_two = "Invalid list, list too short"
        self.assertEqual(actual_result_two, expected_result_two)

if __name__ == "__main__":
    unittest.main()
