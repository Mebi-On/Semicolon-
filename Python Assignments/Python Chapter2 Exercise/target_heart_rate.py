#2.14
age = int(input("Enter your age: "))
max_heart_rate = 220 - age
target_heart_rate_lower = max_heart_rate * 0.5
target_heart_rate_upper = max_heart_rate * 0.85
print("Your maximum heart rate is", max_heart_rate, "BPM")
print("Your target heart rate is between", target_heart_rate_lower, "and", target_heart_rate_upper, "BPM")