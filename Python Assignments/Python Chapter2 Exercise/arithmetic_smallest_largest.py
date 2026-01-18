#2.10
num_1 = int(input("Enter a numbers: "))
num_2 = int(input("Enter a numbers: "))
num_3 = int(input("Enter a numbers: "))

num_lst = [num_1, num_2, num_3]
sum = sum(num_lst)
print("Sum:", sum)
average = sum / 3
print("Average:", average)
product = num_1 * num_2 * num_3
print("Product:", product)  
smallest = min(num_lst)
print("Smallest:", smallest)
largest = max(num_lst)
print("Largest:", largest)