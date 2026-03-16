import unittest
from divided_by_tools import *

class TestDividedBy(unittest.TestCase):

    def test_if_first_number_is_negative_and_second_number_in_range(self):
        actual_result_one = divided_by(-20, 10)
        actual_result_two = divided_by(-49, 20)
        expected_result_one = 0
        expected_result_two = 0
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_if_first_number_is_negative_and_second_number_out_range(self):
        actual_result_one = divided_by(-20, 100)
        actual_result_two = divided_by(-49, 37)
        expected_result_one = 0
        expected_result_two = 0
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_if_second_number_is_out_of_range_and_first_number_positive(self):
        actual_result_one = divided_by(49, 1)
        actual_result_two = divided_by(75, 37)
        expected_result_one = -1
        expected_result_two = -1
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_with_the_second_number_greater_than_the_first_number(self):
        actual_result_one = divided_by(7, 14)
        actual_result_two = divided_by(10, 32)
        expected_result_one = 0
        expected_result_two = 0
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)
    
    def test_with_valid_inputs(self):
        actual_result_one = divided_by(49, 20)
        actual_result_two = divided_by(96, 32)
        expected_result_one = 2
        expected_result_two = 3
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)


    def test_with_extreme_inputs(self):
        actual_result_one = divided_by(10000, 2)
        actual_result_two = divided_by(32, 32)
        expected_result_one = 5000
        expected_result_two = 1
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

if __name__ == "__main__":
    unittest.main()
