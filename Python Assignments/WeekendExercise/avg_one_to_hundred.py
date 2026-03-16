def avg_one_to_hundred():
    sum_total = 0
    for numbers in range(1,101):
        sum_total += numbers
    print("Average of numbers from 1 to 100 =",sum_total/100)

avg_one_to_hundred()