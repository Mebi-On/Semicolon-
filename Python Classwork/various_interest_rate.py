def various_interest_rate(loan_amount, years):
    months = years * 12

    print("\tInterest Rate \tMonthly Payment\tTotal Payment")

    rate = 5.0
    while rate <= 10.0: 
        monthly_rate = rate / 1200  

        monthly_payment = loan_amount * monthly_rate / (1 - (1 / (1 + monthly_rate) ** months))
        total_payment = monthly_payment * months

        print(f"\t{rate:5.3f}%   \t{monthly_payment:6.2f}  \t{total_payment:8.2f}")
        #print("\t", round(rate, 3), "%\t", round(monthly_payment, 2), "\t", round(total_payment, 2))

        rate += 0.25

loan_amount = float(input("Loan Amount: "))
years = int(input("Number of Years: "))
various_interest_rate(loan_amount, years)
