def factorial_for(n):

    if n < 0:
        return "Factorial does not exist for negative numbers"
    elif n == 0:
        return 1
    else:
        result = 1
        for i in range(1, n + 1):
            result *= i
        return result

user_input = int(input("Enter a number: "))
for i in range(user_input):
    for j in range(user_input-i+1):
        print( " " * (i - user_input), end = " ")
    for j in range(i+1):
        # nCr = n!/((n-r)!*r!)
        print(factorial_for(i)//(factorial_for(j)*factorial_for(i-j)), end=" ")
    print()