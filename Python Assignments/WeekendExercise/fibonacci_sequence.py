def fibonacci_sequence():
    number_1 = 0
    number_2 = 1
    for _ in range(20):
        print(number_2, end=" ")
        temp = number_2
        number_2 = number_1 + number_2
        number_1 = temp
    print()

fibonacci_sequence()
