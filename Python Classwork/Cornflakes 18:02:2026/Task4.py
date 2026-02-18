passes = 0
fails = 0
count = 0

while count < 15:
	scores = int(input("Enter student grades:"))
	count += 1

	if scores < 0 or scores > 100:
                count -= 1
                print("Invalid Input, try again")
        else:
                if scores >= 45:
                        passes += 1
                else:
                        fails +=1

print("No. Of Students that Passed", passes)
print("No. Of Students that Failed", fails)
