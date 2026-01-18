def longest_word(input: list):
    longest = 0
    for i in input:
        if len(i) > longest:
            longest = len(i)
            long = i
    return long, longest

print(longest_word(['welcome', 'out', 'weather', 'mobile', 'breakfast', 'journey']))