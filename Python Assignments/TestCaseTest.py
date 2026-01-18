#from unittest import TestCase
import unittest

class TestClass(unittest.TestCase):
    def test_number_is_prime(self):

        is_prime = number_is_prime(11)
        self.assertTrue(is_prime)

def number_is_prime(number):
    if number < 2:
        return False

    counter = 2
    while counter < number:
        if number % counter == 0:
            return False
        counter += 1

    return True

if __name__ == "__main__":
    unittest.main()