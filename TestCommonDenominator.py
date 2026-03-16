import unittest
from common_denominator import highest_common_denominator

class TestCommonDenominator(unittest.TestCase):

    def test_1(self):
        numbers = [6, 9, 15]
        actual_result = highest_common_denominator(numbers)
        expected_result = 3
        self.assertEqual(actual_result, expected_result)

    def test_2(self):
        numbers = [4, 6, 8]
        actual_result = highest_common_denominator(numbers)
        expected_result = 2
        self.assertEqual(actual_result, expected_result)

    def test_3(self):
        numbers = [10, 15, 20]
        actual_result = highest_common_denominator(numbers)
        expected_result = 5
        self.assertEqual(actual_result, expected_result)
        
    def test_4(self):
        numbers = [60, 24, 20]
        actual_result = highest_common_denominator(numbers)
        expected_result = 4
        self.assertEqual(actual_result, expected_result)

if __name__ == "__main__":
    unittest.main()
