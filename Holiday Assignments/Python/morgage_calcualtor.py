def morgage_calcualtor():
    principal_amount = int(input("Enter the principal amount: "))
    anual_intrest_rate = int(input("Enter the annual intrest rate: ")) / 1200
    loan_duration = int(input("Enter the duration in years: ")) * 12

    monthlt_payment = principal_amount * (anual_intrest_rate *((1 + anual_intrest_rate)) ** loan_duration) / (((1 + anual_intrest_rate) ** loan_duration) - 1)
    print ("Your monthly payment is ", round (monthlt_payment, 2))

morgage_calcualtor()