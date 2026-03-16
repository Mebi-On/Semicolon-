
def pyramid(rows):
    for height in range(rows):

        print("\t" * (rows - height), end=" ")


        for width in range(height + 1):
            print(3 ** width, end="\t ")

        for width in range(height - 1, -1, -1):
            print(3 ** width, end="\t ")

        print()

rows = int(input("Enter height of pyramid: ")) 
pyramid(rows)
