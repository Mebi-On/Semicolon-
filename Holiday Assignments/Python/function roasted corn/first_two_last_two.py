def first_two_last_two(input :str):
    if len(input) < 2:
        return "" * 2
    else:
        return input[:2] + input[-2:]
    
print(first_two_last_two("semicolon"))
print(first_two_last_two("on"))
print(first_two_last_two("o"))
    