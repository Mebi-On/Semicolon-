import unittest

class TestPalindromeAndPrime(unittest.TestCase):

    def test_palindrome_and_prime_true(self):
        self.assertTrue(is_palindrome_and_prime(131))

    def test_palindrome_but_not_prime(self):
        self.assertFalse(is_palindrome_and_prime(121))

    def test_prime_but_not_palindrome(self):
        self.assertFalse(is_palindrome_and_prime(13))

    def test_single_digit_prime(self):
        self.assertTrue(is_palindrome_and_prime(7))

    def test_non_prime_number(self):
        self.assertFalse(is_palindrome_and_prime(1))

    def test_negative_number(self):
        self.assertFalse(is_palindrome_and_prime(-131))


def is_palindrome_and_prime(n):
    if n < 2:
        return False
    
    if str(n) != str(n)[::-1]:
        return False

    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False

    return True

if __name__ == "__main__":
    unittest.main()