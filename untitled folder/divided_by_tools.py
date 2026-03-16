
def divided_by(first_number, second_number):
    result = 0
    if first_number <= 0:
        result = 0
    else:
        if second_number < 2 or second_number > 36:
            result = -1
        else:
            while(first_number >= second_number):
                first_number -= second_number
                result += 1
    return result
            
            

