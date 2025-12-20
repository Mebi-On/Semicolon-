from unittest import TestCase

class TestTemperatureAdvisory(TestCase):

    def test_celsius_to_fahrenheit_cold(self):
        self.assertEqual(
            temp_advisory(20, 'C', 70),
            "Cold advisory"
        )

    def test_celsius_to_fahrenheit_heat(self):
        self.assertEqual(
            temp_advisory(30, 'C', 86),
            "Cold advisory"
        )

    def test_fahrenheit_to_celsius_cold(self):
        self.assertEqual(
            temp_advisory(105, 'C', 221),
            "Heat alert"
        )

    def test_fahrenheit_to_celsius_heat(self):
        self.assertEqual(
            temp_advisory(86, 'F', 30),
            "Cold advisory"
        )

    def test_default_unit_is_celsius(self):
        self.assertEqual(
            temp_advisory(25, " " ,77),
            "Cold advisory"
        )

def temp_advisory(temp: float, unit: str):

    if len(input) == 1 or unit == "C" :
        converted_temp = (temp * 9/5) + 32
        threshold = 105
        print(round(converted_temp, 2), "F")

    elif unit == "F":
        converted_temp = (temp - 32) * 5/9
        threshold = 221 
        print(round(converted_temp, 2), "C")

    else:
        print("Invalid input")

    if converted_temp < threshold:
        print("Cold advisory")
    else:
        print("Heat alert")


user_input_temp = input("Enter tempereature here with units ,C ,F: ")
input = user_input_temp.split()
temp = float(input[0])
if len(input) == 1:
     unit = "C" 
else:
     unit = input[1].upper()
print(len(input))
temp_advisory(temp, unit)