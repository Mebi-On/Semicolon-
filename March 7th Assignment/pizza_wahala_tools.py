
def number_of_pizza_boxes(number_of_slices, number_of_people):
    number_of_boxes = (number_of_people + number_of_slices - 1) // number_of_slices
    return number_of_boxes

    
def number_of_leftover(number_of_slices, number_of_people, number_of_boxes):
    left_over = (number_of_boxes * number_of_slices) - number_of_people
    return left_over
    
def total_price(price_per_box, number_of_boxes):
    total_price = price_per_box * number_of_boxes
    return total_price
    
def valid_int(user_input: int, limit: int):
        if user_input.isdigit():
            user_input = int(user_input)
            if user_input < 0 or user_input > limit:
                return False
            else:
                return True
        else:
            return False
