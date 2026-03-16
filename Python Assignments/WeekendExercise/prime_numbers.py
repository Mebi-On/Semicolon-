def prime_numbers():
    number_of_primes = 0
    for numbers in range(2, 101):
        is_prime = True
        for num in range (2, numbers):
            if numbers % num == 0:
                is_prime = False
                break
        if is_prime:
            number_of_primes += 1
            print(numbers, end =" ")    
            
    print("\nTotal primes between 1-100 is: ",number_of_primes)

prime_numbers()