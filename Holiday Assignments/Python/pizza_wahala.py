
def pizza_wahala():
    number_of_people = int(input("Number of people = "))
    pizza_type = input("Piza type = ").lower()

    number_of_slices = 0
    price_per_box = 0
    number_of_boxes = 0
    left_over = 0
    price = 0

    if pizza_type == "sapa size":
        number_of_slices = 4
        price_per_box = 2000
        number_of_boxes = (number_of_people + number_of_slices - 1) // number_of_slices
        left_over = (number_of_boxes * number_of_slices) - number_of_people 
        price = price_per_box * number_of_boxes    
    
    elif pizza_type == "small money":
        number_of_slices = 6
        price_per_box = 2400
        number_of_boxes = (number_of_people + number_of_slices - 1) // number_of_slices
        left_over = (number_of_boxes * number_of_slices) - number_of_people 
        price = price_per_box * number_of_boxes
    
    elif pizza_type == "big boys":
        number_of_slices = 8
        price_per_box = 3000
        number_of_boxes = (number_of_people + number_of_slices - 1) // number_of_slices
        left_over = (number_of_boxes * number_of_slices) - number_of_people 
        price = price_per_box * number_of_boxes
    
    elif pizza_type == "odogwu":
        number_of_slices = 12
        price_per_box = 4200
        number_of_boxes = (number_of_people + number_of_slices - 1) // number_of_slices
        left_over = (number_of_boxes * number_of_slices) - number_of_people 
        price = price_per_box * number_of_boxes
    
    else:
        print ("Invalid Input")

    print("Number of boxes of piza to buy = ", number_of_boxes, " boxes", sep = "") 
    print("Number left over slice after serving = ", left_over ," slices", sep = "")
    print("Prices = ", price)

pizza_wahala()
