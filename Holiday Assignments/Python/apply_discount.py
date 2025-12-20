from unittest import TestCase

class TestApplyDiscount(TestCase):

    def test_save10_discount(self):
        self.assertEqual(apply_discount("Shoes", 100, "SAVE10"), 90.00)

    def test_halfoff_discount(self):
        self.assertEqual(apply_discount("Bag", 200, "HALFOFF"), 100.00)

    def test_invalid_code(self):
        self.assertEqual(apply_discount("Watch", 150, "INVALID"), 150.00)

    def test_no_code(self):
        self.assertEqual(apply_discount("Phone", 500), 500.00)

    def test_case_insensitive_code(self):
        self.assertEqual(apply_discount("Hat", 50, "save10"), 45.00)

    def test_negative_price_raises_error(self):
        with self.assertRaises(ValueError):
            apply_discount("Item", -10, "SAVE10")


def apply_discount(item_name, original_price, promo_code=None):
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
