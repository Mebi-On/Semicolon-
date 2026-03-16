def number_of_unique_characters(first_string, second_string):
        first_string = remove_repeat_characters(first_string.lower())
        second_string = remove_repeat_characters(second_string.lower())
        unique_characters = ""
        
        if first_string == " " or first_string == "" or second_string == " " or second_string == "":
            return -1
        
        for letters in first_string:
            if letters not in unique_characters:
                if letters not in second_string:
                    unique_characters += letters
        
        for letters in second_string:
            if letters not in unique_characters:
                if letters not in first_string:
                    unique_characters += letters
                    
        return len(unique_characters)

    
def remove_repeat_characters(string):
    result = ""

    for first_index in range(len(string)):
        letter = string[first_index]
        count = 0
        for second_index in range(len(string)):
            if string[second_index] == letter:
                count += 1
        if count == 1:
            result += letter
    return result
