def pizza_wahala():
    number_of_people = int(input("Number of people = "))
    if number_of_people <= 0:
        print("Invalid Input")
        
    else:
        print("""
    Pizza type \t    No. of slices \t Prices
    1. Sapa Size \t 4 slices \t 2000
    2. Small Money \t 6 slices \t 2400
    3. Big Boys \t 8 slices \t 3000
    4. Odogwu   \t 12 slices \t 4200
    """)

        pizza_type = input("Piza type = ").lower()
        match pizza_type:
                case "sapa size":
                    number_of_slices = 4
                    price_per_box = 2000

                case "small money":
                    number_of_slices = 6
                    price_per_box = 2400

                case "big boys":
                    number_of_slices = 8
                    price_per_box = 3000

                case "odogwu":
                    number_of_slices = 12
                    price_per_box = 4200  

                case _:
                    print ("Invalid Input")
                    return

        number_of_boxes = (number_of_people + number_of_slices - 1) // number_of_slices
        left_over = (number_of_boxes * number_of_slices) - number_of_people 
        price = price_per_box * number_of_boxes 
        print("Number of boxes of piza to buy = ", number_of_boxes, " boxes", sep = "") 
        print("Number left over slice after serving = ", left_over ," slices", sep = "")
        print("Prices = ", price)

pizza_wahala()