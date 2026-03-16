import unittest
from pizza_wahala_tools import *

class TestPizzaWahala(unittest.TestCase):

    def test_if_input_is_valid(self):
        actual_result_one = valid_int("45", 100)
        actual_result_two = valid_int("-20", 100)
        expected_result_one = True
        expected_result_two = False
        self.assertTrue(actual_result_one, expected_result_one)
        self.assertFalse(actual_result_two, expected_result_two)
        
    def test_number_of_pizza_boxes_function(self):
        actual_result_one = number_of_pizza_boxes(12, 45)
        actual_result_two = number_of_pizza_boxes(4, 23)
        expected_result_one = 4
        expected_result_two = 6
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)
        
    def test_number_of_leftover_function(self):
        actual_result_one = number_of_leftover(12, 45, 4)
        actual_result_two = number_of_leftover(4, 23, 6)
        expected_result_one = 3
        expected_result_two = 1
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)
        
    def test_total_price_function(self):
        actual_result_one = total_price(4200, 4)
        actual_result_two = total_price(2000, 6)
        expected_result_one = 16800
        expected_result_two = 12000
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)


if __name__ == "__main__":
    unittest.main()
