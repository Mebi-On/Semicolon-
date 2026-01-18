def string_len(input: str):
    if input.isalpha() == True:
        return len(input)
    else:
        return "Invalid input"
    
print("Output:",string_len("semicolon"))