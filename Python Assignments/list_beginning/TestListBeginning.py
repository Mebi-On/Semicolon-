import unittest
from task_one import *

class TestListBeginning(unittest.TestCase):

    def test_list_sort(self):
        actual_result_one = selection_sort_list([4, 1, 3, 9, 2])
        actual_result_two = selection_sort_list([9, 12, 31, 9, 22, 27])
        expected_result_one = [1, 2, 3, 4, 9]
        expected_result_two = [9, 9, 12, 22, 27, 31]
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_even_only_list(self):
        actual_result_one = even_only_list([4, 1, 3, 9, 2, 6])
        actual_result_two = even_only_list([9, 12, 31, 9, 22, 27])
        expected_result_one = [4, 2, 6]
        expected_result_two = [12, 22]
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_combine_list(self):
        actual_result_one = combine_lists([1, 2, 3], [4, 5, 6])
        actual_result_two = combine_lists([4, 2, 6], [10, 12, 22])
        expected_result_one = [1, 2, 3, 4, 5, 6] 
        expected_result_two = [4, 2, 6, 10, 12, 22]
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_more_than_three_list(self):
        actual_result_one = more_than_three(["lamb", "kit", "yam", "kings", "dogs", "man"])
        expected_result_one = ['lamb', 'kings', 'dogs']
        actual_result_two = more_than_three(["lambo", "kitten", "yep", "king", "dog", "man", "may"])
        expected_result_two = ['lambo', 'kitten', 'king',]
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)
    

if __name__ == "__main__":
    unittest.main()
