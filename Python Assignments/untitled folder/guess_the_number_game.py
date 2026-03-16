
secret_number = 7
incorrect_guess = True

while(incorrect_guess):
    user_guess = int(input("Guess!, enter a number: "))
    if user_guess != secret_number:
        if user_guess > secret_number:
            print("Too high")
        else:
            print("Too low")
    else:
        incorrect_guess = False
        print("CORRECT!!")