
user_input = input("Hello, Kindly Enter Card details to verify: ").strip()

card_len = len(user_input)
if card_len % 2 == 0:
    count = 1
else: 
    count = 0
card_type = " "
card_validity = " "
even_numbers = 0
odd_numbers = 0

if 13 <= card_len <= 16:
    for i in user_input:
        count += 1

        if count == 2:
            i = int(i)
            if i == 4:
                card_type = "Visa Cards"
            elif i == 5:
                card_type = "MasterCard"
            elif int(user_input[:2]) == 37:
                card_type = "American Express Cards"
            elif i == 6:
                 card_type = "Discover cards"
            else:
                card_type = "Invalid Card"
                card_validity = "Invalid"

        if count % 2 == 0:
            single_digit_even = int(i) * 2

            if len(str(single_digit_even)) > 1:
                single_digit_even = sum(int(digit) for digit in str(single_digit_even))
                even_numbers += single_digit_even

            else:
                even_numbers += single_digit_even

        else:
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
