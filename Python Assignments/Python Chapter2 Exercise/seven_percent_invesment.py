#2.12
invesment = int(input("Enter the invesment amount: "))
rate = 7

future_value_10 = invesment * (1 + (rate / 100)) ** 10
future_value_20 = invesment * (1 + (rate / 100)) ** 20
future_value_30 = invesment * (1 + (rate / 100)) ** 30

print ("Future value after 10 years is: %.2f " %future_value_10)
print ("Future value after 20 years is: %.2f " %future_value_20)
print ("Future value after 30 years is: %.2f " %future_value_30)
