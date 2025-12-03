print("Question 5: Discount Eligibility")
total_bill = int(input("Enter the total bill amount: "))
is_member = input("Are you a member? ('yes' or 'no'): ")
if total_bill >= 1000 and is_member == 'yes':
    discount = total_bill * 0.1
    final_amount = total_bill - discount
    print("Final amount is:", final_amount)
elif total_bill >= 1000 and is_member == 'no':
    discount = total_bill * 0.05
    final_amount = total_bill - discount
    print("Final amount is:", final_amount)
else:
    final_amount = total_bill
    print("Final amount is:", final_amount)
print()