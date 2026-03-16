import unittest
from number_of_unique_characters import number_of_unique_characters

class TestNumberOfUniqueCharacters(unittest.TestCase):

    def test_sample_input(self):
        actual_result_one = number_of_unique_characters("goo", "foo")
        actual_result_two = number_of_unique_characters("rich", "bitch")
        expected_result_one = 2
        expected_result_two = 3
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_if_no_unique_characters(self):
        actual_result_one = number_of_unique_characters("logoo", "gloo")
        actual_result_two = number_of_unique_characters("itch", "tich")
        expected_result_one = 0
        expected_result_two = 0
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_if_both_strings_are_empty(self):
        actual_result_one = number_of_unique_characters(" ", " ")
        actual_result_two = number_of_unique_characters("", "")
        expected_result_one = -1
        expected_result_two = -1
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_if_first_string_is_empty(self):
        actual_result_one = number_of_unique_characters(" ", "cars")
        actual_result_two = number_of_unique_characters("", "Blow")
        expected_result_one = -1
        expected_result_two = -1
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_for_repeat_characters(self):
        actual_result_one = number_of_unique_characters("Fakeiee", "Lyftt")
        actual_result_two = number_of_unique_characters("Bed", "egg")
        expected_result_one = 5
        expected_result_two = 2
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

    def test_with_different_cases(self):
        actual_result_one = number_of_unique_characters("Race", "Crash")
        actual_result_two = number_of_unique_characters("Fakeie", "Lyft")
        expected_result_one = 3
        expected_result_two = 6
        self.assertEqual(actual_result_one, expected_result_one)
        self.assertEqual(actual_result_two, expected_result_two)

if __name__ == "__main__":
    unittest.main()
