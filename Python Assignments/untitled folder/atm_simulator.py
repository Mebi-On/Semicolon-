user_balance = 1000

continue_transaction = True

while(continue_transaction):
    print("""
ATM 
1. Deposit
2. Withdraw
3. Check Balance
0. Exit 

Enter your choice: """)
    mainMenuInput = int(input())

    match mainMenuInput:
        
        case 1 : 
            invalid_input = True
            while(invalid_input):
                deposit_amount = input("Enter Amount: ₦")
                if deposit_amount.isdigit():
                    if int(deposit_amount) <= 0:
                        print("Amount must be greater than 0.")
                        continue
                    else:
                        user_balance += int(deposit_amount)
                        invalid_input = False
                        print(f"₦{deposit_amount} has been deposited to your account.")
                else:
                    print("Invalid input, please enter a valid number.")
               
        case 2 :
            invalid_input = True
            while(invalid_input):
                withdraw_amount = input("Enter Amount: ₦")
                if withdraw_amount.isdigit():
                    withdraw_amount = int(withdraw_amount)

                    if withdraw_amount <= 0:
                        print("Amount must be greater than 0.")
                        continue
                    else:
                        if withdraw_amount > user_balance:
                            print("Insufficient funds \nPlease enter an amount less than or equal to your available balance.")
                        else:
                            user_balance -= withdraw_amount
                            invalid_input = False
                            print(f"₦{withdraw_amount} has been withdrawn from your account.")
                else:
                    print("Invalid input, please enter a valid number.")
        case 3:
            print(f"Available balance is: ₦{user_balance}")
        case 0:
            continue_transaction = False
            print("Exiting ATM")
        case _:
            print("Invalid input, please try again")

