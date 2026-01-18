import unittest

class TestTemperatureAdvisory(unittest.TestCase):

    def test_celsius_to_fahrenheit_cold(self):
        self.assertEqual(
            temp_advisory(20, 'C'),
            "Cold advisory"
        )

    def test_celsius_to_fahrenheit_heat(self):
        self.assertEqual(
            temp_advisory(30, 'C'),
            "Cold advisory"
        )

    def test_fahrenheit_to_celsius_cold(self):
        self.assertEqual(
            temp_advisory(105, 'C'),
            "Heat alert"
        )

    def test_fahrenheit_to_celsius_heat(self):
        self.assertEqual(
            temp_advisory(86, 'F'),
            "Cold advisory"
        )

    def test_default_unit_is_celsius(self):
        self.assertEqual(
            temp_advisory(25, " " ),
            "Cold advisory"
        )


def temp_advisory(temp: int, unit: str ):
    if unit == " " or unit == "" :
        unit = "C"
    else:
        unit = unit.strip().upper()

    if unit == "C" :
        converted_temp = (temp * 9/5) + 32
        threshold = 105

    elif unit == "F":
        converted_temp = (temp - 32) * 5/9
        threshold = 221 


    else:
        return "Invalid input"

    if converted_temp < threshold:
        return "Cold advisory"
    return "Heat alert"


if __name__ == "__main__":
    unittest.main()
