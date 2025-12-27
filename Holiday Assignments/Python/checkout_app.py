


def checkout_app():
    count = 0
    customer_name = input("What is the customer's Name\n").capitalize()
    product_list = []
    amount_of_product_list = []
    cost_list = []
    sub_total = 0.00

    while count < 1:
        product = input("What did the user buy?\n").capitalize()
        product_list.append(product)

        amount_of_product = int(input("How many pieces?\n"))
        amount_of_product_list.append(amount_of_product)

        cost = int(input("How much per unit?\n"))
        cost_list.append(cost)

        sub_total += amount_of_product * cost

        add_items = input("Add more Items?\n")
        if add_items.lower() == "no":
            count += 1
            

    cashier_name = input("Whats is your name?\n").capitalize()
    discount = int(input("How much discount will they get?\n"))
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

    amount_payed = int(input("How much did the custometr give to you?\n"))
    balance = amount_payed - bill_total

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
