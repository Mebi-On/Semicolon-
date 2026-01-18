import unittest

class TestBackToSender(unittest.TestCase):

    def test_1(self):
        self.assertEqual(back_to_sender(40), 11400)

    def test_2(self):
        self.assertEqual(back_to_sender(55), 16000)

    def test_3(self):
        self.assertEqual(back_to_sender(65), 21250)

    def test_4(self):
        self.assertEqual(back_to_sender(80), 45000)



def back_to_sender(collection_rate):

    base_pay = 5000
    if collection_rate < 50:
            amount_per = 160
    elif 50 <= collection_rate <= 59:
            amount_per = 200
    elif 60 <= collection_rate <= 69:
            amount_per = 250
    elif collection_rate >= 70:
            amount_per = 500
            
    total_pay = base_pay + (collection_rate * amount_per)
    print(f"Your total pay is: {total_pay}")
    return total_pay

if __name__ == "__main__":
    unittest.main()