import unittest
from unittest import TestCase
from home_snack_functions import *

class TestHomeSnackFunctions(TestCase):
    def test_length_of_list(self):
        self.assertEqual(length_of_list([1, 2, 3, 4, 5]), 5)
        self.assertEqual(length_of_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 10)
        self.assertEqual(length_of_list([]), 0)
        self.assertEqual(length_of_list([1]), 1)

    def test_sum_of_even_positions_of_a_list(self):
        self.assertEqual(sum_of_even_positions_of_a_list([1, 2, 3, 4, 5]), 9)
        self.assertEqual(sum_of_even_positions_of_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 25)
        self.assertEqual(sum_of_even_positions_of_a_list([]), 0)
        self.assertEqual(sum_of_even_positions_of_a_list([1]), 1)

    def test_sum_of_odd_positions_of_a_list(self):
        self.assertEqual(sum_of_odd_positions_of_a_list([1, 2, 3, 4, 5]), 6)
        self.assertEqual(sum_of_odd_positions_of_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 30)
        self.assertEqual(sum_of_odd_positions_of_a_list([]), 0)
        self.assertEqual(sum_of_odd_positions_of_a_list([1]), 0)

    def test_product_of_all_third_positions_of_a_list(self):
        self.assertEqual(product_of_all_third_positions_of_a_list([1, 2, 3, 4, 5, 6]), 18)
        self.assertEqual(product_of_all_third_positions_of_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 162)
        self.assertEqual(product_of_all_third_positions_of_a_list([]), 1)
        self.assertEqual(product_of_all_third_positions_of_a_list([1]), 1)

    def test_average_of_all_elements_in_a_list(self):
        self.assertEqual(average_of_all_elements_in_a_list([1, 2, 3, 4, 5]), 3)
        self.assertEqual(average_of_all_elements_in_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 5.5)
        self.assertEqual(average_of_all_elements_in_a_list([]), 0)
        self.assertEqual(average_of_all_elements_in_a_list([1]), 1)

    def test_largest_element_in_a_list(self):
        self.assertEqual(largest_element_in_a_list([1, 2, 3, 4, 5]), 5)
        self.assertEqual(largest_element_in_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 10)
        self.assertEqual(largest_element_in_a_list([]), 0)
        self.assertEqual(largest_element_in_a_list([1]), 1)

    def test_smallest_element_in_a_list(self):
        self.assertEqual(smallest_element_in_a_list([1, 2, 3, 4, 5]), 1)
        self.assertEqual(smallest_element_in_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 1)
        self.assertEqual(smallest_element_in_a_list([]), None)
        self.assertEqual(smallest_element_in_a_list([1]), 1)

    def test_number_of_strings_in_list_of_strings(self):
        self.assertEqual(number_of_strings_in_list_of_strings(['a', 'b', 'c']), 3)
        self.assertEqual(number_of_strings_in_list_of_strings(['a', 'b', 'c', 'd', 'e']), 5)
        self.assertEqual(number_of_strings_in_list_of_strings([]), 0)
        self.assertEqual(number_of_strings_in_list_of_strings(['a']), 1)

    def test_same_first_and_last_character_of_a_string(self):
        self.assertEqual(same_first_and_last_character_of_a_string(['abc', 'def', 'ghi']), [])
        self.assertEqual(same_first_and_last_character_of_a_string(['abc', 'def', 'aba', 'cdc']), ['aba', 'cdc'])
        self.assertEqual(same_first_and_last_character_of_a_string([]), [])
        self.assertEqual(same_first_and_last_character_of_a_string(['a']), [])

    def test_sequencial_list_of_numbers(self):
        self.assertEqual(sequencial_list_of_numbers(), [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])

    def test_sum_of_all_third_positions_of_a_list(self):
        self.assertEqual(sum_of_all_third_positions_of_a_list([1, 2, 3, 4, 5, 6]), 9)
        self.assertEqual(sum_of_all_third_positions_of_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 18)
        self.assertEqual(sum_of_all_third_positions_of_a_list([]), 0)
        self.assertEqual(sum_of_all_third_positions_of_a_list([1]), 0)
    
    def test_sum_of_first_middle_last_elements_of_a_list(self):
        self.assertEqual(sum_of_first_middle_last_elements_of_a_list([1, 2, 3, 4, 5]), 9)
        self.assertEqual(sum_of_first_middle_last_elements_of_a_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), 16.5)
        self.assertEqual(sum_of_first_middle_last_elements_of_a_list([]), 0)
        self.assertEqual(sum_of_first_middle_last_elements_of_a_list([1]), 1)
if __name__ == '__main__':    
    unittest.main()