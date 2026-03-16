def valid_int(user_input: int):
        if user_input.isdigit():
            user_input = int(user_input)
            if user_input < 0 or user_input > 100:
                print("Invalid input. Please enter a valid number.")
                return False
            else:
                return True
        else:
            print("Invalid input. Please enter a valid number.")
            return False

def back_to_sender():
    continue_working = True

    while continue_working:
        user_input = input("Enter a number of parcels collected between 0 and 100: ")
    
        if valid_int(user_input) == False:
            continue

        collection_rate = int(user_input)

        if collection_rate < 50:
            amount_per_parcel = 160
        elif 50 <= collection_rate <= 59:
            amount_per_parcel = 200
        elif 60 <= collection_rate <= 69:
            amount_per_parcel = 250
        elif collection_rate >= 70:
            amount_per_parcel = 500

        total_earnings(collection_rate, amount_per_parcel)

        while continue_working:
            continue_running = input("Do you want to calculate again? (y/n): ").lower()
            if continue_running == "y":
                continue_working = True
                break
            elif continue_running == "n":
                continue_working = False
                print("Thank you for using the program.")
            else:
                print("Invalid input")
       

def total_earnings(collection_rate, amount_per_parcel):
            base_salary = 5_000
            total_earnings = base_salary + (collection_rate * amount_per_parcel)
            print(f"Total earnings is : {total_earnings}")

back_to_sender()