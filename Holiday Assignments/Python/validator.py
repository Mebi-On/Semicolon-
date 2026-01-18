
user_input = input("Hello, Kindly Enter Card details to verify: ").strip()
reversed_list = user_input[::-1]
print(reversed_list)

card_len = len(user_input)
print(card_len)

card_type = " "
card_validity = " "
even_numbers = 0
odd_numbers = 0

if 13 <= card_len <= 16:
        
        if user_input[0] == 4:
            card_type = "Visa Cards"
        elif user_input[0] == 5:
            card_type = "MasterCard"
        elif user_input[0] == 3 and user_input[1] == 7:
            card_type = "American Express Cards"
        elif user_input[0] == 6:
            card_type = "Discover cards"
        else:
            card_type = "Invalid Card"
            card_validity = "Invalid"
        
            if len(str(single_digit_even)) > 1:
                single_digit_even = sum(int(digit) for digit in str(single_digit_even))
                even_numbers += single_digit_even

            else:
                even_numbers += single_digit_even

            else:
                even_numbers += single_digit_even

            odd_numbers += int(i)

    if (even_numbers + odd_numbers) % 10 == 0:
        card_validity = "Valid Card Number"
    else: 
        card_validity = "Invalid Card Number"
else:
    print ("Invalid Card, incorect Card Number")

print ("Credit Card Type:",card_type)
print("Credit Card Number:", user_input)
print("Credit Card Digit Length:", card_len)
print("Credit Card Validity Status:", card_validity)


user_input = input("Hello, Kindly Enter Card details to verify: ").strip()

# Ensure only digits
if not user_input.isdigit():
    print("Invalid Card, must contain digits only")
    exit()

card_digits = list(map(int, user_input))
card_len = len(card_digits)

card_type = ""
card_validity = ""
even_numbers = 0
odd_numbers = 0

# Check card length
if 13 <= card_len <= 16:

    # Card type detection
    if card_digits[0] == 4:
        card_type = "Visa Card"
    elif card_digits[0] == 5:
        card_type = "MasterCard"
    elif card_digits[0] == 3 and card_digits[1] == 7:
        card_type = "American Express Card"
    elif card_digits[0] == 6:
        card_type = "Discover Card"
    else:
        card_type = "Unknown Card Type"

    # Luhn Algorithm
    card_digits.reverse()

    for index, digit in enumerate(card_digits):
        if index % 2 == 1:  # even position in original number
            doubled = digit * 2
            if doubled > 9:
                doubled -= 9
            even_numbers += doubled
        else:
            odd_numbers += digit

    if (even_numbers + odd_numbers) % 10 == 0:
        card_validity = "Valid Card Number"
    else:
        card_validity = "Invalid Card Number"

else:
    print("Invalid Card, incorrect Card Number")
    exit()

# Output
print("Credit Card Type:", card_type)
print("Credit Card Number:", user_input)
print("Credit Card Digit Length:", card_len)
print("Credit Card Validity Status:", card_validity)

