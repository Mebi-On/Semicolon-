


def checkout_app():
    count = 0
    customer_name = input("What is the customer's Name\n").capitalize()
    product_list = []
    amount_of_product_list = []
    cost_list = []
    sub_total = 0.00

    while count < 1:
        product = input("What did the user buy?\n").capitalize()
        if product.isalpha() == False:
            print("Invalid product name, please enter a valid name.")
            continue
        else:
            product_list.append(product)

        amount_of_product = (input("How many pieces?\n"))
        if amount_of_product.isnumeric() == False:
            print("Invalid amount, please enter a valid number.")
            continue
        else:
            amount_of_product = int(amount_of_product)
            if amount_of_product < 0:
                print("Invalid amount, please enter a valid number.")
                continue
            else:
                amount_of_product_list.append(amount_of_product)

        cost = (input("How much per unit?\n"))
        if cost.isnumeric() == False:
            print("Invalid cost, please enter a valid number.")
            continue
        else:
            cost = float(cost)
            if cost < 0:
                print("Invalid cost, please enter a valid number.")
                continue
            else:
                cost_list.append(cost)

        sub_total += amount_of_product * cost

        add_items = input("Add more Items?\n")
        if add_items.lower() == "no":
            count += 1
            

    cashier_name = input("Whats is your name?\n").capitalize()
    continue_loop = True
    while continue_loop:
        discount = int(input("How much discount will they get?\n"))
        if discount < 0:
            print("Invalid discount, please enter a valid number.")
        else:
            continue_loop = False
            discount_total = round(sub_total * discount / 100, 2)
            vat = round(sub_total * 0.175,2)
            bill_total = sub_total - discount_total + vat

    print("SEMICOLON STORES \nMAIN BRANCH")
    print("LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS. \nTEL: 03293828343")
    print("Date :")
    print("Cashier:", cashier_name)
    print("Customer Name:", customer_name)

    print("=================================================")

    print("\nITEM\tQTY\tPRICE")

    print("-------------------------------------------------")
    for index in range(len(product_list)):
        print(f"{product_list[index]}\t{amount_of_product_list[index]}\t{cost_list[index]}")
    
    print("-------------------------------------------------")

    print("\t\t Sub Total: ", sub_total)
    print("\t\t Discount: ", discount_total)
    print("\t\t VAT @ 17.50%: ", vat)

    print("=================================================")
    print("\t\t Bill Total: ", bill_total)

    print("=================================================")
    print("THIS IS NOT AN RECEIPT KINDLY PAY ", bill_total)

    print("=================================================")

    continue_amount_payed = True
    while continue_amount_payed:
        amount_payed = (input("How much did the custometr give to you?\n"))
        if amount_payed.isnumeric() == False:
            print("Invalid amount, please enter a valid number.")
            continue
        else:
            amount_payed = float(amount_payed)
            if amount_payed < bill_total:
                    print("Insufficient Amount, Kindly pay the full amount.")
            else:
                balance = amount_payed - bill_total
                break

    print("SEMICOLON STORES \nMAIN BRANCH")
    print("LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS. \nTEL: 03293828343")
    print("Date :")
    print("Cashier:", cashier_name)
    print("Customer Name:", customer_name)

    print("=================================================")

    print("\nITEM\tQTY\tPRICE")

    print("-------------------------------------------------")
    for index in range(len(product_list)):
        print(f"{product_list[index]}\t{amount_of_product_list[index]}\t{cost_list[index]}")
    
    print("-------------------------------------------------")

    print("\t\t Sub Total: ", sub_total)
    print("\t\t Discount: ", discount_total)
    print("\t\t VAT @ 17.50%: ", vat)

    print("=================================================")
    print("\t\t Bill Total:  ", bill_total)
    print("\t\t Amount Payed:  ", amount_payed)
    print("\t\t Balance:  ", balance)

    print("=================================================")
    print("THANK YOU FOR YOUR PATRONAGE")

    print("=================================================")


checkout_app()
