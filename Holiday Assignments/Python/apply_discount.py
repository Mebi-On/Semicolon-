import unittest

class TestApplyDiscount(unittest.TestCase):

    def test_save10_discount(self):
        self.assertEqual(apply_discount("Cereal", 100, "SAVE10"), 90.00)

    def test_halfoff_discount(self):
        self.assertEqual(apply_discount("Candy", 200, "HALFOFF"), 100.00)

    def test_invalid_code(self):
        self.assertEqual(apply_discount("Fanta", 150, "INVALID"), 150.00)

    def test_no_code(self):
        self.assertEqual(apply_discount("Rice", 500), 500.00)

    def test_case_insensitive_code(self):
        self.assertEqual(apply_discount("Beef", 50, "save10"), 45.00)

    def test_negative_price_raises_error(self):
        with self.assertRaises(ValueError):
            apply_discount("Item", -10, "SAVE10")


def apply_discount(item_name: str, original_price: int, promo_code = None):
    if original_price < 0:
        raise ValueError("Price cannot be negative")

    discount = 0.0

    if promo_code:
        promo_code = promo_code.upper()
        if promo_code == "SAVE10":
            discount = 0.10
        elif promo_code == "HALFOFF":
            discount = 0.50

    return round(original_price * (1 - discount), 2)

if __name__ == "__main__":
    unittest.main()