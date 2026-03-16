from pizza_wahala_tools import *
def pizza_wahala():
        
    continue_working = True
    while continue_working:

        user_input = input("Number of people = ")
    
        if valid_int(user_input, 100) == False:
            print("Invalid input. Please enter a valid number.")
            continue
        
        number_of_people = int(user_input)

        print("""
    Pizza type 
    1. Sapa Size, 4 slices, ₦2000
    2. Small Money, 6 slices, ₦2400
    3. Big Boys, 8 slices, ₦3000
    4. Odogwu, 12 slices, ₦4200
    """)

        pizza_type = input("Pizza type number = ")
        match pizza_type:
                case "1" :
                    number_of_slices = 4
                    price_per_box = 2000

                case "2" :
                    number_of_slices = 6
                    price_per_box = 2400

                case "3" :
                    number_of_slices = 8
                    price_per_box = 3000

                case "4":
                    number_of_slices = 12
                    price_per_box = 4200  

                case _:
                    print ("Invalid Input")
                    continue
        number_of_boxes = number_of_pizza_boxes(number_of_slices, number_of_people)
        left_over = number_of_leftover(number_of_slices, number_of_people, number_of_boxes)
        price = total_price(price_per_box, number_of_boxes)
        
        print("Number of boxes of pizza = ", number_of_boxes, " boxes", sep = "") 
        print("Number left over slice after serving = ", left_over ," slices", sep = "")
        print("Prices = ₦", price, sep = "")

        while continue_working:
            continue_running = input("Do you want to calculate again? (y/n): ").lower()
            if continue_running == "y":
                continue_working = True
                break
            elif continue_running == "n":
                continue_working = False
                print("Thank you for using the program.")
            else:
                print("Invalid input")

pizza_wahala()
