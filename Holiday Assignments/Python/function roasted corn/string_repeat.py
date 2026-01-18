def string_repeat(input: str, repeat: int):
    if type(repeat) != int:
        return input
    else:
        input = input * repeat
        return input
    
print(string_repeat("hello", 3))
print(string_repeat("hi", 4.5))