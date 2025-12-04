
user_input = input("Enter speed and acceleration in m/s and m/s^2: ")
speed, acceleration = user_input.split()
speed = float(speed)
acceleration = float(acceleration)  

if acceleration > 0: 	
	runway_length = (speed ** 2) / (2 * acceleration)
	print(f"The minimum runway length for the airplane is {runway_length:.3f} meters" )
else:
	print("Acceleration and velocity must be positive")