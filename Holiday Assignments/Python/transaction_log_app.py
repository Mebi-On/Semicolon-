def deposit(x, y):
    
    new_balance += amount
    return new_balance
    
def transactionappend(transaction):
    transaction_list.append(transaction)
    return transaction_list
    
    
new_balance = 0
transaction_list = []
    
def transactionLogApp():
    
    continue_main_menu = True
    while continue_main_menu:
                print(
"""
Transaction Log App

1. Deposit
2. Withdraw
3. Show Transactions
4. Exit

Enter here: """
                        )

                main_menu_input = int(input())
                match main_menu_input:
                    
                    case 1 :
                        continue_deposit = True
                        while continue_deposit:
                            amount = float(input("Enter deposit amount: "))
                            if amount > 0:
                                deposit(new_balance, amount)
                                transaction = ("Deposited: ₦", amount, "| New Balace: ₦", new_balance)
                                print("Transaction", len(transaction_list))
                                print(f"Deposited: ₦{amount} | New Balace: ₦{new_balance}")
                            else:
                                 print("Invalid amount")

                    case 2 :
                        continue_withdraw = True
                        while continue_withdraw:
                            amount = int(input("Enter withdrawal amount: "))
                            if amount > 0:
                                if amount > new_balance:
                                    print("Insufficient funds. Available balance: ₦", new_balance, sep = "")
                                    
                                else:
                                    new_balance -= amount
                                    transaction_list.append(("Withdrew: ₦", amount, "| New Balace: ₦", new_balance))
                                    print("Transaction", len(transaction_list))
                                    print(f"Withdrew: ₦{amount} | New Balace: ₦{new_balance}")
                                    break
                            else:
                                 print("Invalid amount")

                    case 3 :
                        if transaction_list == []:
                            print("No transactions yet.")
                        else:
                            for index, (action, amount, text, balance) in enumerate(transaction_list):
                                print(f"{index + 1}. {action}{amount} {text}{balance}")

                            
                    case 4 :
                        print("Final Balance: ₦", new_balance, sep = "")
                        break 
                    
                    case _ :
                        print("Invalid, Please try again.")
transactionLogApp()




















Bool (True or False)














