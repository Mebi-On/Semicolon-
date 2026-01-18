def ing_ly (input: str):
    if len(input) > 2:
        if input[-3:] == "ing":
            input += "ly"
            return input
        else:
            input += "ing"
            return input
    else:
        return input
    
print(ing_ly("abc"))
print(ing_ly("string"))
print(ing_ly("on"))
print(ing_ly("oning"))