
driving_distance = float(input("Enter the driving distance in miles: "))
miles_per_gallon = float(input("Enter fuel efficiency in miles per gallon: "))
price_per_gallon = float(input("Enter price per gallon: "))

if driving_distance > 0 and price_per_gallon > 0 and miles_per_gallon > 0:
	cost_of_trip = driving_distance * price_per_gallon / miles_per_gallon
	print(f"The cost of driving is ${cost_of_trip:.2f}")
else:
	print("Your entries cannot be negative, Try again")