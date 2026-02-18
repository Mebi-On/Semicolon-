def back_to_sender():
    base_pay = 5000
    continue_loop = True

    while continue_loop:
        user_input = input("Enter a number of parcels collected between 0 and 100: ")

        if is_valid_input(user_input) == False:
            continue

        collection_rate = int(user_input)

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
            
        while continue_loop:
            continue_running = input("Do you want to calculate again? (yes/no): ").lower()
            if continue_running == "yes":
                continue_loop = True
                break
            elif continue_running == "no":
                continue_loop = False
                print("Thank you for using the program.")
            else:
                print("Invalid input")
    

def is_valid_input(user_input: int):
        if user_input.isdigit():
            user_input = int(user_input)
            if user_input < 0 or user_input > 100:
                print("Invalid input. Please enter a valid int.")
                return False
            else:
                return True
        else:
            print("Invalid input. Please enter a valid int.")
            return False

back_to_sender()