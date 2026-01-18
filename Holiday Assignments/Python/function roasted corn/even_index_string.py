def even_index_string(input: str):
    count = 0
    new_string = " "
    for i in input:
        #print(i)
        count += 1
        if count % 2 == 0:
            new_string += i 
    return new_string
        
print(even_index_string("semicolon"))