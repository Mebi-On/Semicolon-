#2.11
seperate_num = int(input("Enter a five digit number: "))
if len(str(seperate_num)) == 5:
    num_1 = seperate_num // 10000
    num_2 = (seperate_num % 10000) // 1000
    num_3 = (seperate_num % 1000) // 100
    num_4 = (seperate_num % 100) // 10
    num_5 = seperate_num % 10
    print(num_1, num_2, num_3, num_4, num_5, sep = "   ")
else:
    print("Please enter a five digit number.")